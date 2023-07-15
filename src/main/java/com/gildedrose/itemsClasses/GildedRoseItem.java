package main.java.com.gildedrose.itemsClasses;

public abstract class GildedRoseItem extends Item{
    protected static int maxQuality = 50;

    protected GildedRoseItem(String name, int sellIn, int quality) {
        super(name, sellIn, Math.min(quality, maxQuality));
    }

    protected GildedRoseItem(String name, int sellIn, int quality, int maxQuality) {
        super(name, sellIn, Math.min(quality, maxQuality));
        GildedRoseItem.maxQuality = maxQuality;
    }

    public void updateItem() {
        this.updateQuality();
        this.updateSellIn();
        System.out.println("Item: " + this.getName() + " updated quality: " + this.quality + ", updated sell in: " + this.sellIn);
    }

    protected void updateSellIn(){this.sellIn--;}
    protected void updateQuality(){
        this.quality--;
        if (this.sellIn < 0) this.quality--;
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
