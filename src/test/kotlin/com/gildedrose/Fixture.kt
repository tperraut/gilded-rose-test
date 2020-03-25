package com.gildedrose

import com.gildedrose.model.Item

object Fixture {
    const val tNormalItemName: String = "+5 Dexterity Vest"
    const val tAnotherNormalItemName: String = "Elixir of the Mongoose"
    const val tLegendaryItemName: String = "Sulfuras, Hand of Ragnaros"
    const val tConjuredItemName: String = "Conjured Mana Cake"
    const val tAgedBrieItemName: String = "Aged Brie"
    const val tBackStageItemName: String = "Backstage passes to a TAFKAL80ETC concert"

    val tItems = arrayOf(
            Item(tNormalItemName, 10, 20),
            Item(tAgedBrieItemName, 2, 0),
            Item(tAnotherNormalItemName, 5, 7),
            Item(tLegendaryItemName, 0, 80),
            Item(tLegendaryItemName, -1, 80),
            Item(tBackStageItemName, 15, 20),
            Item(tBackStageItemName, 10, 49),
            Item(tBackStageItemName, 5, 49),
            Item(tConjuredItemName, 3, 6)
    )
}