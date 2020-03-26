package com.gildedrose.model

import com.gildedrose.Fixture
import org.junit.Assert
import org.junit.Test

class ItemTest {

    @Test
    fun `should match the pattern name, sellIn, quality when the toString method is called`() {
        // setup
        val item = Item(Fixture.tNormalItemName, 10, 5)
        // act
        val result = item.toString()
        // assert
        Assert.assertEquals("${Fixture.tNormalItemName}, 10, 5", result)
    }
}