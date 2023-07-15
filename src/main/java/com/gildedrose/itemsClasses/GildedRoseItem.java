package main.java.com.gildedrose.itemsClasses;

public abstract class GildedRoseItem extends Item{
    protected int maxQuality;

    protected GildedRoseItem(String name, int sellIn, int quality) {
        super(name, sellIn, Math.min(quality, 50));
    }

    protected GildedRoseItem(String name, int sellIn, int quality, int maxQuality) {
        super(name, sellIn, Math.min(quality, maxQuality));
        this.maxQuality = maxQuality;
    }

    public void updateItem() {
        this.updateQuality();
        this.updateSellIn();
    }

    protected void updateSellIn(){this.sellIn--;}
    protected void updateQuality(){
        this.quality--;
        if (this.sellIn < 0) this.quality--;
        this.quality = Math.max(this.quality, 0);
    }

    public String getName() {
        return name;
    }

    public int getMaxQuality() {
        return maxQuality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
