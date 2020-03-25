package com.gildedrose.base

import com.gildedrose.model.Item

/**
 * At the end of each day all items should call those methods on themselves
 */
abstract class BaseItem(private val item: Item) {
    protected open val minQuality: Int = 0
    protected open val maxQuality: Int = 50

    open fun update() {
        updateQuality()
        updateSellIn()
    }

    protected abstract fun updateQuality()
    protected abstract fun updateSellIn()
}