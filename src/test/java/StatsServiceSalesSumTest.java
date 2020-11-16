import static org.junit.jupiter.api.Assertions.*;

class StatsServiceSalesSumTest {

    @org.junit.jupiter.api.Test
    void salesSum() {
        StatsService sumCalculator = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = sumCalculator.salesSum(sales);

        assertEquals (expected, actual);
    }
}