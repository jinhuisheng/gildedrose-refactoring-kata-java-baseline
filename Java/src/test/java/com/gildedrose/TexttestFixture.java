package com.gildedrose;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TexttestFixture {
    public static void main(String[] args) {
        String baseLine = getBaseLine();
        System.out.println(baseLine);
    }

    public static String getBaseLine() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);

        printStream.println("OMGHAI!");

        AbstractItem[] abstractItems = new AbstractItem[]{
                new NormalAbstractItem("+5 Dexterity Vest", 10, 20), //
                new AgedBrieAbstractItem(2, 0), //
                new NormalAbstractItem("Elixir of the Mongoose", 5, 7), //
                new SulfurasAbstractItem( 0, 80), //
                new SulfurasAbstractItem( -1, 80),
                new BackstageAbstractItem(15, 20),
                new BackstageAbstractItem(10, 49),
                new BackstageAbstractItem(5, 49),
                // this conjured item does not work properly yet
                new NormalAbstractItem("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(abstractItems);

        int days = 3;

        for (int i = 0; i < days; i++) {
            printStream.println("-------- day " + i + " --------");
            printStream.println("name, sellIn, quality");
            for (AbstractItem abstractItem : abstractItems) {
                printStream.println(abstractItem);
            }
            printStream.println();
            app.updateQuality();
        }
        return out.toString();
    }
}
