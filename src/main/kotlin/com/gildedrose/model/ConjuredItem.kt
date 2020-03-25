package com.gildedrose.model

import com.gildedrose.base.BaseItem

/**
 * Conjured items degrade in quality twice as fast as [NormalItem]
 */
data class ConjuredItem(private val item: Item) : BaseItem(item) {
    override fun updateQuality() {
        TODO("Not yet implemented")
    }

    override fun updateSellIn() {
        TODO("Not yet implemented")
    }
}