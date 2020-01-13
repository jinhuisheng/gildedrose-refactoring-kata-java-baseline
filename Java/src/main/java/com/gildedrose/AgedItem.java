package com.gildedrose;

/**
 * @author huisheng.jin
 * @date 2020/1/13.
 */
class AgedItem extends Item {
    AgedItem(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    void oneDayPass() {
        increaseQuanlity();

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            increaseQuanlity();
        }
    }

}
