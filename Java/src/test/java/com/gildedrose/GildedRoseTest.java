package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        AbstractItem[] abstractItems = new AbstractItem[]{new NormalAbstractItem("foo", 0, 0)};
        GildedRose app = new GildedRose(abstractItems);
        app.updateQuality();
        assertEquals("foo", app.abstractItems[0].name);
    }

}
