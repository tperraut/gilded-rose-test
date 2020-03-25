package com.gildedrose.model

import com.gildedrose.base.BaseItem

/**
 * Conjured items degrade in quality twice as fast as [NormalItem]
 */
data class ConjuredItem(private val item: Item) : BaseItem(item) {
    override fun updateQuality() {
        if (item.quality <= minQuality) {
            return
        }
        val sellIn = item.sellIn
        when {
            sellIn > 0 -> item.quality -= 2
            else -> item.quality -= 4
        }
    }

    override fun updateSellIn() {
        item.sellIn--
    }
}