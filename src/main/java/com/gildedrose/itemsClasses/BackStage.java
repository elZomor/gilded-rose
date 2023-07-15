package main.java.com.gildedrose.itemsClasses;

public class BackStage extends GildedRoseItem{
    private static final String name = "Backstage passes to a TAFKAL80ETC concert";
    private static final int maxQuality = 50;

    public BackStage(int sellIn, int quality) {
        super(name, sellIn, quality, maxQuality);
    }

    @Override
    protected void updateQuality() {
        if (this.sellIn < 0) {
            this.quality = 0;
            return;
        }

        if (this.quality >= maxQuality) return;

        if (this.sellIn <= 5) {
            this.quality++;
        }

        if (this.sellIn <= 10) {
            this.quality++;
        }
        this.quality++;
        this.quality = Math.min(this.quality, maxQuality);
    }
}