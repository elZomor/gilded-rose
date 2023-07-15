package main.java.com.gildedrose.itemsClasses;

public class BackStage extends GildedRoseItem{
    private static final String name = "Backstage passes to a TAFKAL80ETC concert";
    public BackStage(int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        if (this.quality >= maxQuality && this.sellIn > 0) return;

        if (this.sellIn < 0) {
            this.quality = 0;
            return;
        }
        if (this.sellIn <= 5) {
            this.quality += 3;
            return;
        }

        if (this.sellIn <= 10) {
            this.quality += 2;
            return;
        }
        this.quality++;
    }
}