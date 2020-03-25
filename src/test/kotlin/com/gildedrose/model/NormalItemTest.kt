package com.gildedrose.model

import com.gildedrose.Fixture
import org.junit.Assert.assertEquals
import org.junit.Test

class NormalItemTest {

    @Test
    fun `should decrease the item quality value by one when its sellIn value is greater than 0`() {
        // setup
        val item = Item(Fixture.tNormalItemName, 4, 5)
        val normalItem = NormalItem(item)
        // act
        normalItem.updateQuality()
        // assert
        assertEquals(4, item.quality)
    }

    @Test
    fun `should decrease the item quality value by 2 when its sellIn value is equal to 0`() {
        // setup
        val item = Item(Fixture.tNormalItemName, 0, 5)
        val normalItem = NormalItem(item)
        // act
        normalItem.updateQuality()
        // assert
        assertEquals(3, item.quality)
    }

    @Test
    fun `should decrease the item quality value by 2 when its sellIn value is lesser than 0`() {
        // setup
        val item = Item(Fixture.tNormalItemName, -4, 5)
        val normalItem = NormalItem(item)
        // act
        normalItem.updateQuality()
        // assert
        assertEquals(3, item.quality)
    }

    @Test
    fun `should not decrease the item quality value when it has already dropped to 0`() {
        // setup
        val item = Item(Fixture.tNormalItemName, 4, 0)
        val normalItem = NormalItem(item)
        // act
        normalItem.updateQuality()
        // assert
        assertEquals(0, item.quality)
    }

    @Test
    fun `should decrease the item sellIn value by one when updateSellIn method is called`() {
        // setup
        val item = Item(Fixture.tNormalItemName, 4, 5)
        val normalItem = NormalItem(item)
        // act
        normalItem.updateSellIn()
        // assert
        assertEquals(3, item.sellIn)
    }
}