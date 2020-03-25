package com.gildedrose.model

import com.gildedrose.base.BaseItem

/**
 * Aged brie increases in quality every day and can never drop
 */
data class AgedBrieItem(private val item: Item) : BaseItem(item) {
    override fun updateQuality() {
        val sellIn = item.sellIn
        when {
            sellIn > 10 -> item.quality++
            sellIn > 5 -> item.quality += 2
            else -> item.quality += 3
        }
    }
}