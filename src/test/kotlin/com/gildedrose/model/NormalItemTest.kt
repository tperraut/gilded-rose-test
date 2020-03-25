package com.gildedrose.model

import com.gildedrose.Fixture
import org.junit.Assert.assertEquals
import org.junit.Test

class NormalItemTest {

    @Test
    fun `should decrease the quality by one when the sellIn value is greater than 0`() {
        // setup
        val item = Item(Fixture.tNormalItemName, 4, 5)
        val normalItem = NormalItem(item)
        // act
        normalItem.updateQuality()
        // assert
        assertEquals(4, item.quality)
    }
}