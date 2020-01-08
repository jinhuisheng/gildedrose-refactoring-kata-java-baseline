package com.gildedrose;

class GildedRose {
    AbstractItem[] abstractItems;

    public GildedRose(AbstractItem[] abstractItems) {
        this.abstractItems = abstractItems;
    }

    public void updateQuality() {
        for (AbstractItem abstractItem : abstractItems) {
            abstractItem.updateQuality();
        }
    }

}