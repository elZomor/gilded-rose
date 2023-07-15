package main.java.com.gildedrose;

import main.java.com.gildedrose.itemsClasses.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GildedRoseItem agedBrie = new AgedBrie(-4, 34);
        GildedRoseItem backStage = new BackStage(-4, 34);
        GildedRoseItem sulfuras = new Sulfuras(-4, 34);
        GildedRoseItem other = new Other(-4, 34);
        GildedRoseItem conjured = new Conjured(-4, 34);

        ArrayList<GildedRoseItem> items = new ArrayList<>(Arrays.asList(
                agedBrie,
                backStage,
                sulfuras,
                other,
                conjured
        ));

        items.forEach(GildedRoseItem::updateItem);
    }
}
