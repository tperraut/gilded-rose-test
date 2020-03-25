package com.gildedrose.utils

import com.gildedrose.base.BaseItem
import com.gildedrose.base.IScanner
import com.gildedrose.model.*

object ItemScanner : IScanner {

    private val catalog: Map<String, (item: Item) -> BaseItem> = mapOf(
            "Sulfuras, Hand of Ragnaros" to ::LegendaryItem,
            "Conjured Mana Cake" to ::ConjuredItem,
            "Aged Brie" to ::AgedBrieItem,
            "Backstage passes to a TAFKAL80ETC concert" to ::BackStageItem
    )

    override fun scan(item: Item): BaseItem {
        val mapper = catalog[item.name]
        return mapper?.invoke(item) ?: NormalItem(item)
    }
}