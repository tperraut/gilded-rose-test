package com.gildedrose.model

import com.gildedrose.Fixture
import org.junit.Assert.assertEquals
import org.junit.Test

class LegendaryItemTest {

    @Test
    fun `should not alter the item quality value when the update method is called`() {
        // setup
        val item = Item(Fixture.tLegendaryItemName, 0, 80)
        val legendaryItem = LegendaryItem(item)
        // act
        legendaryItem.update()
        // assert
        assertEquals(80, item.quality)
    }

    @Test
    fun `should not alter the item sellIn value when the update method is called`() {
        // setup
        val item = Item(Fixture.tLegendaryItemName, 0, 80)
        val legendaryItem = LegendaryItem(item)
        // act
        legendaryItem.update()
        // assert
        assertEquals(0, item.sellIn)
    }
}