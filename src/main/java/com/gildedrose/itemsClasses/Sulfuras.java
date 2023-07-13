package main.java.com.gildedrose.itemsClasses;

public class Sulfuras extends Item{
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality, 80);
    }

    @Override
    public void updateItem(){
        System.out.println("Item: " + this.getName() + " updated quality: " +
                this.quality + ", updated sell in: " + this.sellIn);
    }

}
