package com.gildedrose

import com.gildedrose.model.Item
import org.junit.Assert.assertEquals
import org.junit.Test

class GildedRoseTest {

    @Test fun foo() {
        val items = arrayOf<Item>(Item("foo", 0, 0))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals("fixme", app.items[0].name)
    }


}


