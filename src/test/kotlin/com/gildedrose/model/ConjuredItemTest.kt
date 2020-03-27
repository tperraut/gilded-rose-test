package com.gildedrose.model

import com.gildedrose.Fixture
import org.junit.Assert.assertEquals
import org.junit.Test

class ConjuredItemTest {

    @Test
    fun `should decrease the item quality value by 2 when its sellIn value is greater than 0`() {
        // setup
        val item = Item(Fixture.tConjuredItemName, 4, 5)
        val conjuredItem = ConjuredItem(item)
        // act
        conjuredItem.update()
        // assert
        assertEquals(3, item.quality)
    }

    @Test
    fun `should decrease the item quality value by 4 when its sellIn value is equal to 0`() {
        // setup
        val item = Item(Fixture.tConjuredItemName, 0, 5)
        val conjuredItem = ConjuredItem(item)
        // act
        conjuredItem.update()
        // assert
        assertEquals(1, item.quality)
    }

    @Test
    fun `should decrease the item quality value by 4 when its sellIn value is lesser than 0`() {
        // setup
        val item = Item(Fixture.tConjuredItemName, -4, 5)
        val conjuredItem = ConjuredItem(item)
        // act
        conjuredItem.update()
        // assert
        assertEquals(1, item.quality)
    }

    @Test
    fun `should not decrease the item quality value when it has already dropped to 0`() {
        // setup
        val item = Item(Fixture.tConjuredItemName, 4, 0)
        val conjuredItem = ConjuredItem(item)
        // act
        conjuredItem.update()
        // assert
        assertEquals(0, item.quality)
    }

    @Test
    fun `should decrease the item sellIn value by one when update method is called`() {
        // setup
        val item = Item(Fixture.tConjuredItemName, 4, 5)
        val conjuredItem = ConjuredItem(item)
        // act
        conjuredItem.update()
        // assert
        assertEquals(3, item.sellIn)
    }
}