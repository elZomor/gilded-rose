package test.java.com.gildedrose;

import main.java.com.gildedrose.itemsClasses.GildedRoseItem;
import main.java.com.gildedrose.itemsClasses.Other;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OthersTest {
    int qualityFifty = 50;
    int qualityLessThanFifty = 40;
    int sellInMoreThanZero = 10;
    int sellInLessThanZero = -5;

    /**
     * Inputs -> sell in > 0, quality < 50
     * Expected -> sell in decreases by 1, quality decreases by 1
     */
    @Test
    void testQualityLessThanFiftySellInMoreThanZero(){
        GildedRoseItem other = new Other(this.sellInMoreThanZero, this.qualityLessThanFifty);
        other.updateItem();
        assertEquals(this.sellInMoreThanZero - 1, other.getSellIn());
        assertEquals(this.qualityLessThanFifty - 1, other.getQuality());
    }

    /**
     * Inputs -> sell in < 0, quality < 50
     * Expected -> sell in decreases by 1, quality decreases by 2
     */
    @Test
    void testQualityLessThanFiftySellInLessThanZero(){
        GildedRoseItem other = new Other(this.sellInLessThanZero, this.qualityLessThanFifty);
        other.updateItem();
        assertEquals(this.sellInLessThanZero - 1, other.getSellIn());
        assertEquals(this.qualityLessThanFifty - 2, other.getQuality());
    }

    /**
     * Inputs -> sell in > 0, quality = 50
     * Expected -> sell in decreases by 1, quality decreases by 1
     */
    @Test
    void testQualityFiftySellInMoreThanZero(){
        GildedRoseItem other = new Other(this.sellInMoreThanZero, this.qualityFifty);
        other.updateItem();
        assertEquals(this.sellInMoreThanZero - 1, other.getSellIn());
        assertEquals(this.qualityFifty - 1, other.getQuality());
    }

    /**
     * Inputs -> sell in < 0, quality < 50
     * Expected -> sell in decreases by 1, quality decreases by 2
     */
    @Test
    void testQualityFiftySellInLessThanZero(){
        GildedRoseItem other = new Other(this.sellInLessThanZero, this.qualityFifty);
        other.updateItem();
        assertEquals(this.sellInLessThanZero - 1, other.getSellIn());
        assertEquals(this.qualityFifty - 2, other.getQuality());
    }
}
