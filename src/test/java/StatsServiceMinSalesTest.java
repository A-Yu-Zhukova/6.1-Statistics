import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceMinSalesTest {

    @Test
    void minSales() {
        StatsService minimum = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = minimum.minSales(sales);

        assertEquals (expected, actual);
    }
}