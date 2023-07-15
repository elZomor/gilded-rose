package test.java.com.gildedrose;

import main.java.com.gildedrose.itemsClasses.AgedBrie;
import main.java.com.gildedrose.itemsClasses.BackStage;
import main.java.com.gildedrose.itemsClasses.GildedRoseItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackStageTest {
    int qualityFifty = 50;
    int qualityLessThanFifty = 40;
    int sellInMoreThanTen = 13;
    int sellInBetweenFiveAndTen = 8;
    int sellInBetweenZeroAndFive = 3;
    int sellInLessThanZero = -5;

    /**
     * Inputs -> sell in > 10, quality < 50
     * Expected -> sell in decreases by 1, quality increases by 1
     */
    @Test
    void testBackStageQualityLessThanFiftySellInMoreThanTen () {
        BackStage backStage = new BackStage(this.sellInMoreThanTen, this.qualityLessThanFifty);
        backStage.updateItem();
        assertEquals(this.qualityLessThanFifty + 1, backStage.getQuality());
        assertEquals(this.sellInMoreThanTen - 1, backStage.getSellIn());
    }

    /**
     * Inputs -> 5 < sell in < 10, quality < 50
     * Expected -> sell in decreases by 1, quality increases by 2
     */
    @Test
    void testBackStageQualityLessThanFiftySellInBetweenFiveAndTen () {
        BackStage backStage = new BackStage(this.sellInBetweenFiveAndTen, this.qualityLessThanFifty);
        backStage.updateItem();
        assertEquals(this.qualityLessThanFifty + 2, backStage.getQuality());
        assertEquals(this.sellInBetweenFiveAndTen - 1, backStage.getSellIn());
    }

    /**
     * Inputs -> 0 < sell in < 5, quality < 50
     * Expected -> sell in decreases by 1, quality increases by 3
     */
    @Test
    void testBackStageQualityLessThanFiftySellInBetweenZeroAndFive () {
        BackStage backStage = new BackStage(this.sellInBetweenZeroAndFive, this.qualityLessThanFifty);
        backStage.updateItem();
        assertEquals(this.qualityLessThanFifty + 3, backStage.getQuality());
        assertEquals(this.sellInBetweenZeroAndFive - 1, backStage.getSellIn());
    }

    /**
     * Inputs -> sell in < 0, quality < 50
     * Expected -> sell in decreases by 1, quality is 0
     */
    @Test
    void testBackStageQualityLessThanFiftySellInLessThanZero () {
        BackStage backStage = new BackStage(this.sellInLessThanZero, this.qualityLessThanFifty);
        backStage.updateItem();
        assertEquals(0, backStage.getQuality());
        assertEquals(this.sellInLessThanZero - 1, backStage.getSellIn());
    }

    /**
     * Inputs -> sell in > 10, quality = 50
     * Expected -> sell in decreases by 1, quality remains the same
     */
    @Test
    void testBackStageQualityFiftySellInMoreThanTen () {
        BackStage backStage = new BackStage(this.sellInMoreThanTen, this.qualityFifty);
        backStage.updateItem();
        assertEquals(this.qualityFifty, backStage.getQuality());
        assertEquals(this.sellInMoreThanTen - 1, backStage.getSellIn());
    }

    /**
     * Inputs -> 5 < sell in < 10, quality = 50
     * Expected -> sell in decreases by 1, quality remains the same
     */
    @Test
    void testBackStageQualityFiftySellInBetweenFiveAndTen () {
        BackStage backStage = new BackStage(this.sellInBetweenFiveAndTen, this.qualityFifty);
        backStage.updateItem();
        assertEquals(this.qualityFifty, backStage.getQuality());
        assertEquals(this.sellInBetweenFiveAndTen - 1, backStage.getSellIn());
    }

    /**
     * Inputs -> 0 < sell in < 5, quality = 50
     * Expected -> sell in decreases by 1, quality remains the same
     */
    @Test
    void testBackStageQualityFiftySellInBetweenZeroAndFive () {
        BackStage backStage = new BackStage(this.sellInBetweenZeroAndFive, this.qualityFifty);
        backStage.updateItem();
        assertEquals(this.qualityFifty, backStage.getQuality());
        assertEquals(this.sellInBetweenZeroAndFive - 1, backStage.getSellIn());
    }

    /**
     * Inputs -> sell in < 0, quality = 50
     * Expected -> sell in decreases by 1, quality 0
     */
    @Test
    void testBackStageQualityFiftySellInLessThanZero () {
        BackStage backStage = new BackStage(this.sellInLessThanZero, this.qualityFifty);
        backStage.updateItem();
        assertEquals(0, backStage.getQuality());
        assertEquals(this.sellInLessThanZero - 1, backStage.getSellIn());
    }
}
