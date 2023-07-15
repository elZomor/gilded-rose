package test.java.com.gildedrose;

import main.java.com.gildedrose.itemsClasses.AgedBrie;
import main.java.com.gildedrose.itemsClasses.GildedRoseItem;
import main.java.com.gildedrose.itemsClasses.Sulfuras;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTest {
    int qualityEighty = 80;
    int qualityLessThanEighty = 40;
    int sellInMoreThanZero = 10;
    int sellInLessThanZero = -5;

    /**
     * Inputs -> sell in > 0, quality < 80
     * Expected -> sell in remains, quality remains
     */
    @Test
    void testQualityLessThanEightySellInMoreThanZero(){
        GildedRoseItem sulfuras = new Sulfuras(this.sellInMoreThanZero, this.qualityLessThanEighty);
        sulfuras.updateItem();
        assertEquals(this.sellInMoreThanZero, sulfuras.getSellIn());
        assertEquals(this.qualityLessThanEighty, sulfuras.getQuality());
    }

    /**
     * Inputs -> sell in < 0, quality < 80
     * Expected -> sell in remains, quality remains
     */
    @Test
    void testQualityLessThanEightySellInLessThanZero(){
        GildedRoseItem sulfuras = new Sulfuras(this.sellInLessThanZero, this.qualityLessThanEighty);
        sulfuras.updateItem();
        assertEquals(this.sellInLessThanZero, sulfuras.getSellIn());
        assertEquals(this.qualityLessThanEighty, sulfuras.getQuality());
    }

    /**
     * Inputs -> sell in > 0, quality = 80
     * Expected -> sell in remains, quality remains
     */
    @Test
    void testQualityEightySellInMoreThanZero(){
        GildedRoseItem sulfuras = new Sulfuras(this.sellInMoreThanZero, this.qualityEighty);
        sulfuras.updateItem();
        assertEquals(this.sellInMoreThanZero, sulfuras.getSellIn());
        assertEquals(this.qualityEighty, sulfuras.getQuality());
    }

    /**
     * Inputs -> sell in < 0, quality = 80
     * Expected -> sell in remains, quality remains
     */
    @Test
    void testQualityEightySellInLessThanZero(){
        GildedRoseItem sulfuras = new Sulfuras(this.sellInLessThanZero, this.qualityEighty);
        sulfuras.updateItem();
        assertEquals(this.sellInLessThanZero, sulfuras.getSellIn());
        assertEquals(this.qualityEighty, sulfuras.getQuality());
    }
}
