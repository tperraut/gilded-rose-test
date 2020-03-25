package com.gildedrose

import com.gildedrose.base.BaseItem
import com.gildedrose.model.Item
import com.gildedrose.utils.ItemScanner

class GildedRose(var items: Array<Item>) {

    fun updateQuality() {
        items.map(ItemScanner::scan).forEach(BaseItem::update)
    }
}

