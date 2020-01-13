package com.gildedrose;

/**
 * @author huisheng.jin
 * @date 2020/1/13.
 */
class SulfurasItem extends Item {
    SulfurasItem(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    void oneDayPass() {
    }
}
