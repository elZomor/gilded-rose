package main.java.com.gildedrose.itemsClasses;

public class Other extends Item{
    public Other(int sellIn, int quality) {
        super("Other", sellIn, quality, 50);
    }

    @Override
    protected void updateQuality() {
        this.quality--;
        if (this.sellIn < 0) this.quality--;
    }
}
