package com.gildedrose.model

import com.gildedrose.base.BaseItem

/**
 * Backstage passes act like [AgedBrieItem] but their quality drop to 0 when the sale by date as passed
 */
data class BackStageItem(private val item: Item) : BaseItem(item) {
    override fun updateQuality() {
        val sellIn = item.sellIn
        val quality = when {
            sellIn > 10 -> item.quality + 1
            sellIn > 5 -> item.quality + 2
            sellIn > 0 -> item.quality + 3
            else -> 0
        }
        item.quality = ensureGoodQuality(quality)
    }
}