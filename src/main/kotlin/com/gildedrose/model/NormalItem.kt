package com.gildedrose.model

import com.gildedrose.base.BaseItem

/**
 * Normal items decreases by one in quality every day and by 2 after the sale by date has passed
 */
data class NormalItem(private val item: Item) : BaseItem(item) {
    override fun updateQuality() {
        TODO("Not yet implemented")
    }

    override fun updateSellIn() {
        TODO("Not yet implemented")
    }
}