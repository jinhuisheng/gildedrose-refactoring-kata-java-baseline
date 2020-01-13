package com.gildedrose;

/**
 * @author huisheng.jin
 * @date 2020/1/13.
 */
class BackstageItem extends Item {
    BackstageItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    void oneDayPass() {
        // 有四种商品，不同分类上提，分离出不同商品的处理逻辑
        if (quality < 50) {
            quality = quality + 1;

            if (sellIn < 11) {
                increaseQuanlity();
            }

            if (sellIn < 6) {
                increaseQuanlity();
            }
        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            quality = 0;
        }
    }
}
