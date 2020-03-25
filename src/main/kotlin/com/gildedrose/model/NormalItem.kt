package com.gildedrose.model

import com.gildedrose.base.BaseItem

/**
 * Normal items decreases by one in quality every day and by 2 after the sale by date has passed
 */
data class NormalItem(private val item: Item) : BaseItem(item) {
    override fun updateQuality() {
        if (item.quality <= minQuality) {
            return
        }
        val sellIn = item.sellIn
        when {
            sellIn > 0 -> item.quality--
            else -> item.quality -= 2
        }
    }

    override fun updateSellIn() {
        item.sellIn--
    }
}