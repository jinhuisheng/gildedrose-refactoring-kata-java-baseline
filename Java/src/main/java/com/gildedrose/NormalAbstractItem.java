package com.gildedrose;

public class NormalAbstractItem extends AbstractItem {

    public NormalAbstractItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQuality() {
        decreaseQuality();
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            decreaseQuality();
        }
    }

}
