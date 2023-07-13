package main.java.com.gildedrose;

import main.java.com.gildedrose.itemsClasses.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Item a = new AgedBrie(-4, 34);
        Item b = new BackStage(-4, 34);
        Item c = new Sulfuras(-4, 34);
        Item d = new Other(-4, 34);

        ArrayList<Item> items = new ArrayList<>(Arrays.asList(a, b, c, d));
        items.forEach(Item::updateItem);
    }
}
