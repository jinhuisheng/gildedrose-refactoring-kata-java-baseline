package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.reporters.JunitReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    @UseReporter(JunitReporter.class)
    void foo() {
        CombinationApprovals.verifyAllCombinations(this::oneDayPass
                , new String[]{"foo","Aged Brie","Backstage passes to a TAFKAL80ETC concert","Sulfuras, Hand of Ragnaros"}
                , new Integer[]{-1,0,5,6,11}
                , new Integer[]{0,1,49,50,51});
    }

    private String oneDayPass(String name, int sellIn, int quality) {
        Item[] items = new Item[]{Item.createItem(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }

}
