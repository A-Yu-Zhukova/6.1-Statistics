import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceMaxSalesTest {

    @Test
    void maxSales() {
        StatsService maximum = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = maximum.maxSales(sales);

        assertEquals (expected, actual);
    }
}