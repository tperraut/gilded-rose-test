package com.gildedrose.model

import com.gildedrose.base.BaseItem

/**
 * Backstage passes act like [AgedBrieItem] but their quality drop to 0 when the sale by date as passed
 */
data class BackStageItem(private val item: Item) : BaseItem(item) {
    override fun updateQuality() {
        if (item.quality <= minQuality || item.quality >= maxQuality) {
            return
        }
        val sellIn = item.sellIn
        when {
            sellIn > 10 -> item.quality++
            sellIn > 5 -> item.quality += 2
            sellIn > 0 -> item.quality += 3
            else -> item.quality = 0
        }
    }
}