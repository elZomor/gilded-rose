package main.java.com.gildedrose.itemsClasses;

public abstract class Item {
    protected String name;

    protected int sellIn;
    protected int quality;
    protected int maxQuality = 50;

    protected Item(String name, int sellIn, int quality, int maxQuality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.maxQuality = maxQuality;
    }

    public void updateItem() {
        this.updateQuality();
        this.updateSellIn();
        System.out.println("Item: " + this.getName() + " updated quality: " + this.quality + ", updated sell in: " + this.sellIn);
    }

    protected void updateSellIn(){this.sellIn--;}
    protected void updateQuality(){this.quality--;}

    private Item(){}

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
