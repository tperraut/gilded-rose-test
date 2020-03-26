package com.gildedrose.base

import com.gildedrose.model.Item

interface IScanner {
    fun scan(item: Item): BaseItem
}