package com.gildedrose.utils

import com.gildedrose.Fixture
import com.gildedrose.model.*
import org.junit.Test

class ItemScannerTest {

    @Test
    fun `should return an instance of NormalItem when the scan method is called with a normal item name`() {
        // setup
        val item = Item(Fixture.tNormalItemName, 4, 5)
        // act
        val normalItem = ItemScanner.scan(item)
        // assert
        assert(normalItem is NormalItem)
    }

    @Test
    fun `should return an instance of AgedBrieItem when the scan method is called with an aged brie item name`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, 4, 5)
        // act
        val normalItem = ItemScanner.scan(item)
        // assert
        assert(normalItem is AgedBrieItem)
    }

    @Test
    fun `should return an instance of BackStageItem when the scan method is called with a back stage item name`() {
        // setup
        val item = Item(Fixture.tBackStageItemName, 4, 5)
        // act
        val normalItem = ItemScanner.scan(item)
        // assert
        assert(normalItem is BackStageItem)
    }

    @Test
    fun `should return an instance of ConjuredItem when the scan method is called with a conjured item name`() {
        // setup
        val item = Item(Fixture.tConjuredItemName, 4, 5)
        // act
        val normalItem = ItemScanner.scan(item)
        // assert
        assert(normalItem is ConjuredItem)
    }

    @Test
    fun `should return an instance of LegendaryItem when the scan method is called with a legendary item name`() {
        // setup
        val item = Item(Fixture.tLegendaryItemName, 4, 5)
        // act
        val normalItem = ItemScanner.scan(item)
        // assert
        assert(normalItem is LegendaryItem)
    }
}