package com.gildedrose;

public class Item {

    private String name;

    int sellIn;

    int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static Item createItem(String name, int sellIn, int quality) {
        // 符合开闭原则 ，对修改关闭，对扩展开放
        switch (name) {
            case "Aged Brie":
                return new AgedItem(sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageItem(sellIn, quality);
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItem(sellIn, quality);
            default:
                return new Item(name, sellIn, quality);
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void oneDayPass() {
        if (quality > 0) {
            quality = quality - 1;
        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            if (quality > 0) {
                quality = quality - 1;
            }
        }
    }

    protected void increaseQuanlity() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
