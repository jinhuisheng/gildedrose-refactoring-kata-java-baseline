package com.gildedrose;

/**
 * @author huisheng.jin
 */
public abstract class AbstractItem {

    public String name;

    int sellIn;

    int quality;

    AbstractItem(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    /**
     * 更新quality
     */
    abstract void updateQuality();

    void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }
}
