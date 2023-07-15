package main.java.com.gildedrose.itemsClasses;

public class Other extends GildedRoseItem{
    private static final int maxQuality = 50;

    public Other(String name, int sellIn, int quality) {
        super(name, sellIn, quality, maxQuality);
    }
    public Other(int sellIn, int quality) {
        super("Other", sellIn, quality, maxQuality);
    }

}
