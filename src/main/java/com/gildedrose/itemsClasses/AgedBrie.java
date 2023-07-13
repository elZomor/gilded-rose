package main.java.com.gildedrose.itemsClasses;

public class AgedBrie extends Item{
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality, 50);
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
