package main.java.com.gildedrose.itemsClasses;

public class AgedBrie extends GildedRoseItem{
    private static final String name = "Aged Brie";
    public AgedBrie(int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        if (this.quality >= this.maxQuality) return;

        this.quality++;

        if (this.sellIn < 0) {
            this.quality++;
        }
    }

}
