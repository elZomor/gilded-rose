package main.java.com.gildedrose.itemsClasses;

public class BackStage extends Item{
    public BackStage(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality, 50);
    }

    @Override
    protected void updateQuality() {
        if (this.quality >= this.maxQuality) return;

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