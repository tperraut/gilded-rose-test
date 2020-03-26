package com.gildedrose.model

import com.gildedrose.base.BaseItem

/**
 * Legendary items cannot be sold nor change their quality of 80
 */
data class LegendaryItem(private val item: Item) : BaseItem(item) {
    override val maxQuality: Int = 80

    override fun updateQuality() {
        /* Do nothing */
    }

    override fun updateSellIn() {
        /* Do nothing */
    }
}