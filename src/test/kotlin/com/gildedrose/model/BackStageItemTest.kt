package com.gildedrose.model

import com.gildedrose.Fixture
import org.junit.Assert.assertEquals
import org.junit.Test

class BackStageItemTest {

    @Test
    fun `should increase the item quality value by one when its sellIn value is greater than 10`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, 11, 5)
        val normalItem = BackStageItem(item)
        // act
        normalItem.update()
        // assert
        assertEquals(6, item.quality)
    }

    @Test
    fun `should increase the item quality value by 2 when its sellIn value is equal to 10`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, 10, 5)
        val normalItem = BackStageItem(item)
        // act
        normalItem.update()
        // assert
        assertEquals(7, item.quality)
    }

    @Test
    fun `should increase the item quality value by 2 when its sellIn value is lower than 10 and greater than 5`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, 7, 5)
        val normalItem = BackStageItem(item)
        // act
        normalItem.update()
        // assert
        assertEquals(7, item.quality)
    }

    @Test
    fun `should increase the item quality value by 3 when its sellIn value is equal to 5`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, 5, 5)
        val normalItem = BackStageItem(item)
        // act
        normalItem.update()
        // assert
        assertEquals(8, item.quality)
    }

    @Test
    fun `should increase the item quality value by 3 when its sellIn value is lower than 5 and greater than 0`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, 2, 5)
        val normalItem = BackStageItem(item)
        // act
        normalItem.update()
        // assert
        assertEquals(8, item.quality)
    }

    @Test
    fun `should not increase the item quality value when its quality value is 50`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, 2, 50)
        val normalItem = BackStageItem(item)
        // act
        normalItem.update()
        // assert
        assertEquals(50, item.quality)
    }

    @Test
    fun `should drop the item quality value to 0 when its sellIn value is equal to 0`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, 0, 5)
        val normalItem = BackStageItem(item)
        // act
        normalItem.update()
        // assert
        assertEquals(0, item.quality)
    }

    @Test
    fun `should drop the item quality value to 0 when its sellIn value is lower than 0`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, -4, 5)
        val normalItem = BackStageItem(item)
        // act
        normalItem.update()
        // assert
        assertEquals(0, item.quality)
    }

    @Test
    fun `should decrease the item sellIn value by one when update method is called`() {
        // setup
        val item = Item(Fixture.tAgedBrieItemName, 4, 5)
        val normalItem = BackStageItem(item)
        // act
        normalItem.update()
        // assert
        assertEquals(3, item.sellIn)
    }
}