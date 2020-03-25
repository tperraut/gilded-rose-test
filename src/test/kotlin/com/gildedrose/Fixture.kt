package com.gildedrose

import com.gildedrose.model.Item

object Fixture {
    const val tNormalItemName: String = "+5 Dexterity Vest"
    const val tAnotherNormalItemName: String = "Elixir of the Mongoose"
    const val tLegendaryItemName: String = "Sulfuras, Hand of Ragnaros"
    const val tConjuredItemName: String = "Conjured Mana Cake"
    const val tAgedBrieItemName: String = "Aged Brie"

    val tItems = arrayOf(
            Item(tNormalItemName, 10, 20),
            Item(tAgedBrieItemName, 2, 0),
            Item(tAnotherNormalItemName, 5, 7),
            Item(tLegendaryItemName, 0, 80),
            Item(tLegendaryItemName, -1, 80),
            Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            Item(tConjuredItemName, 3, 6)
    )
}