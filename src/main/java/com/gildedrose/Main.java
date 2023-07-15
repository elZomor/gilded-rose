package main.java.com.gildedrose;

import main.java.com.gildedrose.itemsClasses.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<GildedRoseItem> items = new ArrayList<>(Arrays.asList(
                new Other("+5 Dexterity Vest", 10, 20),
                new AgedBrie(2, 0),
                new Other("Elixir of the Mongoose", 5, 7),
                new Sulfuras(0, 80),
                new Sulfuras(1, 80),
                new BackStage(15, 20),
                new BackStage(10, 49),
                new BackStage(5, 49),
                new Conjured(3, 6)
        ));

        int days = 2;
        for (int i = 0; i < days; i++) {
            System.out.println("DAY: " + (i+1) );
            System.out.println("name, sellIn, quality");
            items.forEach(System.out::println);

            items.forEach(GildedRoseItem::updateItem);
        }

    }
}
