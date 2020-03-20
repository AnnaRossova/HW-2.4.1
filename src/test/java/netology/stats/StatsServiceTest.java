package netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int expectedSum = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expectedSum, actual);
    }
    @Test
    void calculateMiddleSum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int expectedMiddleSum = 15;
        int actual = service.calculateMiddleSum(sales);
        assertEquals(expectedMiddleSum, actual);
    }

    @Test
    void findMonthMax() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int expectedMonthMax = 8;
        int actual = service.findMonthMax(sales);
        assertEquals(expectedMonthMax, actual);
    }
    @Test
    void findMonthMin() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int expectedMonthMin = 9;
        int actual = service.findMonthMin(sales);
        assertEquals(expectedMonthMin, actual);
    }
    @Test
    void findOverMiddleSum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int expectedOverMiddleSum = 5;
        int actual = service.findOverMiddleSum(sales);
        assertEquals(expectedOverMiddleSum, actual);
    }
    @Test
    void findUnderMiddleSum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int expectedUnderMiddleSum = 5;
        int actual = service.findUnderMiddleSum(sales);
        assertEquals(expectedUnderMiddleSum, actual);
    }
}
