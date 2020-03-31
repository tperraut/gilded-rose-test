package com.gildedrose.model

import com.gildedrose.Fixture
import org.junit.Assert.assertEquals
import org.junit.Test

class AgedBrieItemTest {

    @Test
    fun `should increase the item quality value by one when its sellIn value is greater than 0`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, 14, 5)
        val agedBrieItem = AgedBrieItem(item)
        // act
        agedBrieItem.update()
        // assert
        assertEquals(6, item.quality)
    }

    @Test
    fun `should increase the item quality value by one when its sellIn value is equal to 0`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, 0, 5)
        val agedBrieItem = AgedBrieItem(item)
        // act
        agedBrieItem.update()
        // assert
        assertEquals(6, item.quality)
    }

    @Test
    fun `should increase the item quality value by one when its sellIn value is lower than 0`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, -4, 5)
        val agedBrieItem = AgedBrieItem(item)
        // act
        agedBrieItem.update()
        // assert
        assertEquals(6, item.quality)
    }

    @Test
    fun `should not increase the item quality value when its quality value is equal to 50`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, -4, 50)
        val agedBrieItem = AgedBrieItem(item)
        // act
        agedBrieItem.update()
        // assert
        assertEquals(50, item.quality)
    }

    @Test
    fun `should decrease the item sellIn value by one when update method is called`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, 4, 5)
        val agedBrieItem = AgedBrieItem(item)
        // act
        agedBrieItem.update()
        // assert
        assertEquals(3, item.sellIn)
    }
}