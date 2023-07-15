package test.java.com.gildedrose;
import main.java.com.gildedrose.itemsClasses.AgedBrie;
import main.java.com.gildedrose.itemsClasses.GildedRoseItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {
    /**
     * Testing Aged Brie class
     */
    int qualityFifty = 50;
    int qualityLessThanFifty = 40;
    int sellInMoreThanZero = 10;
    int sellInLessThanZero = -5;

    /**
     * Inputs -> sell in > 0, quality < 50
     * Expected -> sell in decreases by 1, quality increases by 1
     */
    @Test
    void testQualityLessThanFiftySellInMoreThanZero(){
        GildedRoseItem agedBrie = new AgedBrie(this.sellInMoreThanZero, this.qualityLessThanFifty);
        agedBrie.updateItem();
        assertEquals(this.sellInMoreThanZero - 1, agedBrie.getSellIn());
        assertEquals(this.qualityLessThanFifty + 1, agedBrie.getQuality());
    }

    /**
     * Inputs -> sell in < 0, quality < 50
     * Expected -> sell in decreases by 1, quality increases by 2
     */
    @Test
    void testQualityLessThanFiftySellInLessThanZero(){
        GildedRoseItem agedBrie = new AgedBrie(this.sellInLessThanZero, this.qualityLessThanFifty);
        agedBrie.updateItem();
        assertEquals(this.sellInLessThanZero - 1, agedBrie.getSellIn());
        assertEquals(this.qualityLessThanFifty + 2, agedBrie.getQuality());
    }

    /**
     * Inputs -> sell in < 0, quality = 50
     * Expected -> sell in decreases by 1, quality remains same
     */
    @Test
    void testQualityFiftySellInMoreThanZero(){
        GildedRoseItem agedBrie = new AgedBrie(this.sellInMoreThanZero, this.qualityFifty);
        agedBrie.updateItem();
        assertEquals(this.sellInMoreThanZero - 1, agedBrie.getSellIn());
        assertEquals(this.qualityFifty, agedBrie.getQuality());
    }

    /**
     * Inputs -> sell in > 0, quality = 50
     * Expected -> sell in decreases by 1, quality remains same
     */
    @Test
    void testQualityFiftySellInLessThanZero(){
        GildedRoseItem agedBrie = new AgedBrie(this.sellInLessThanZero, this.qualityFifty);
        agedBrie.updateItem();
        assertEquals(this.sellInLessThanZero - 1, agedBrie.getSellIn());
        assertEquals(this.qualityFifty, agedBrie.getQuality());
    }
}
