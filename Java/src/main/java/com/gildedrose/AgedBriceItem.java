package com.gildedrose;

/**
 * @author huisheng.jin
 * @date 2020/1/8.
 */
public class AgedBriceItem extends Item {
    public AgedBriceItem(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }
}
