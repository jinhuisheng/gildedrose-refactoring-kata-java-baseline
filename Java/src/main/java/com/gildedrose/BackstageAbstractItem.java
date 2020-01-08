package com.gildedrose;

public class BackstageAbstractItem extends AbstractItem {

    public BackstageAbstractItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    void updateQuality() {
        increaseQuality();
        if (sellIn < 11) {
            increaseQuality();
        }
        if (sellIn < 6) {
            increaseQuality();
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            quality = 0;
        }
    }
}
