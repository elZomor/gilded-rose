package test.java.com.gildedrose;
import main.java.com.gildedrose.itemsClasses.AgedBrie;
import main.java.com.gildedrose.itemsClasses.Item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {
    int qualityMoreThanFifty = 60;
    int qualityLessThanFifty = 40;
    int sellInMoreThanZero = 10;
    int sellInLessThanZero = -5;

    @Test
    void testQualityLessThanFiftySellInMoreThanZero(){
        Item agedBrie = new AgedBrie(this.sellInMoreThanZero, this.qualityLessThanFifty);
        agedBrie.updateItem();
        assertEquals(this.qualityLessThanFifty + 1, agedBrie.getQuality());
        assertEquals(this.sellInMoreThanZero - 1, agedBrie.getSellIn());
    }

    @Test
    void testQualityLessThanFiftySellInLessThanZero(){
        Item agedBrie = new AgedBrie(this.sellInLessThanZero, this.qualityLessThanFifty);
        agedBrie.updateItem();
        assertEquals(this.qualityLessThanFifty + 2, agedBrie.getQuality());
        assertEquals(this.sellInLessThanZero - 1, agedBrie.getSellIn());
    }

    @Test
    void testQualityMoreThanFiftySellInMoreThanZero(){
        Item agedBrie = new AgedBrie(this.sellInMoreThanZero, this.qualityMoreThanFifty);
        agedBrie.updateItem();
        assertEquals(this.qualityMoreThanFifty, agedBrie.getQuality());
        assertEquals(this.sellInMoreThanZero - 1, agedBrie.getSellIn());
    }

    @Test
    void testQualityMoreThanFiftySellInLessThanZero(){
        Item agedBrie = new AgedBrie(this.sellInLessThanZero, this.qualityMoreThanFifty);
        agedBrie.updateItem();
        assertEquals(this.qualityMoreThanFifty, agedBrie.getQuality());
        assertEquals(this.sellInLessThanZero - 1, agedBrie.getSellIn());
    }
}
