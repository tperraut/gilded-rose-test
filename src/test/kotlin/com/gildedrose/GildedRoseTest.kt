package com.gildedrose

import com.gildedrose.base.BaseItem
import com.gildedrose.base.IScanner
import com.nhaarman.mockitokotlin2.*
import org.junit.Test

class GildedRoseTest {

    @Test
    fun `should scan all items when updateQuality method is called`() {
        // setup
        val itemScannerMock = mock<IScanner>() {
            on { scan(any()) } doReturn mock()
        }
        val app = GildedRose(Fixture.tItems, itemScannerMock)
        // act
        app.updateQuality()
        // assert
        verify(itemScannerMock, times(Fixture.tItems.size)).scan(any())
    }

    @Test
    fun `should call update method on all scanned items when updateQuality method is called`() {
        // setup
        val scannedItemList = List(Fixture.tItems.size) { mock<BaseItem>() }
        val itemScannerMock = mock<IScanner>() {
            on { scan(any()) } doReturnConsecutively scannedItemList
        }
        val app = GildedRose(Fixture.tItems, itemScannerMock)
        // act
        app.updateQuality()
        // assert
        scannedItemList.forEach { item ->
            verify(item).update()
        }
    }
}


