package main.java.com.gildedrose.itemsClasses;

public class AgedBrie extends GildedRoseItem{
    private static final String name = "Aged Brie";
    private static final int maxQuality = 50;
    public AgedBrie(int sellIn, int quality) {
        super(name, sellIn, quality, maxQuality);
    }

    @Override
    protected void updateQuality() {
        if (this.quality >= maxQuality) return;

        this.quality++;

        if (this.sellIn < 0) {
            this.quality++;
        }
        this.quality = Math.min(this.quality, maxQuality);
    }

}
