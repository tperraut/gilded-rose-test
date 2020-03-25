package com.gildedrose.model

import com.gildedrose.base.BaseItem

/**
 * Normal items decreases by one in quality every day and by 2 after the sale by date has passed
 */
data class NormalItem(private val item: Item) : BaseItem(item) {
    override fun updateQuality() {
        val sellIn = item.sellIn
        val quality = when {
            sellIn > 0 -> item.quality - 1
            else -> item.quality - 2
        }
        item.quality = ensureGoodQuality(quality)
    }
}