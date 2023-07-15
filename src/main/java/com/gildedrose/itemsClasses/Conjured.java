package main.java.com.gildedrose.itemsClasses;

public class Conjured extends GildedRoseItem{
    private static final String name = "Conjured";
    private static final int maxQuality = 50;

    public Conjured(int sellIn, int quality) {
        super(name, sellIn, quality, maxQuality);
    }
}
