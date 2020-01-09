package com.gildedrose;

/**
 * @author huisheng.jin
 * @date 2020/1/9.
 */
public class SulfurasItem extends Item {
    public SulfurasItem(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    void updateQuality() {
    }
}
