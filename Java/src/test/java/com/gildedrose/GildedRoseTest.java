package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;


class GildedRoseTest {

    @Test
    void updateQuality() {
        CombinationApprovals.verifyAllCombinations(this::doUpdateQuality
                ,new String[]{"foo","Backstage passes to a TAFKAL80ETC concert","Sulfuras, Hand of Ragnaros","Aged Brie","Sulfuras, Hand of Ragnaros"}
                ,new Integer[]{-1,0,5,11,10}
                ,new Integer[]{0,1,49,50,51,52});

    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[]{Item.createItem(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }

}
