package com.gildedrose.model

import com.gildedrose.base.BaseItem

/**
 * Backstage passes act like [AgedBrieItem] but their quality drop to 0 when the sale by date as passed
 */
data class BackStageItem(private val item: Item) : BaseItem(item) {
    override fun updateQuality() {
        TODO("Not yet implemented")
    }

    override fun updateSellIn() {
        TODO("Not yet implemented")
    }
}