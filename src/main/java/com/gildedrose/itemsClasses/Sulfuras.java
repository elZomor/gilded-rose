package main.java.com.gildedrose.itemsClasses;

public class Sulfuras extends GildedRoseItem{
    private static final String name = "Sulfuras, Hand of Ragnaros";
    private static final int maxQuality = 80;

    public Sulfuras(int sellIn, int quality) {
        super(name, sellIn, quality, maxQuality);
    }

    @Override
    public void updateItem(){}

}
