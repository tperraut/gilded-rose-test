package com.gildedrose.model

import com.gildedrose.base.BaseItem

/**
 * Aged brie increases in quality every day and can never drop
 */
data class AgedBrieItem(private val item: Item) : BaseItem(item) {
    override fun updateQuality() {
        TODO("Not yet implemented")
    }

    override fun updateSellIn() {
        TODO("Not yet implemented")
    }
}