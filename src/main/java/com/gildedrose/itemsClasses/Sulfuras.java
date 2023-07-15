package main.java.com.gildedrose.itemsClasses;

public class Sulfuras extends GildedRoseItem{
    private static final String name = "Sulfuras, Hand of Ragnaros";
    public Sulfuras(int sellIn, int quality) {
        super(name, sellIn, quality, 80);
    }

    @Override
    public void updateItem(){
        System.out.println("Item: " + this.getName() + " updated quality: " +
                this.quality + ", updated sell in: " + this.sellIn);
    }

}
