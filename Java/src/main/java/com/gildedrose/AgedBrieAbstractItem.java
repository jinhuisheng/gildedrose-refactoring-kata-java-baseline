package com.gildedrose;

public class AgedBrieAbstractItem extends AbstractItem {

    public AgedBrieAbstractItem(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    void updateQuality() {
        increaseQuality();
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            increaseQuality();
        }
    }

}
