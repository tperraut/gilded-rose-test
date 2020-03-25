package com.gildedrose

import com.gildedrose.base.BaseItem
import com.gildedrose.base.IScanner
import com.gildedrose.model.Item
import com.gildedrose.utils.ItemScanner

class GildedRose(
        items: Array<Item>,
        scanner: IScanner = ItemScanner
) {

    private val scannedItems: List<BaseItem> = items.map(scanner::scan)

    fun updateQuality() {
        scannedItems.forEach(BaseItem::update)
    }
}

