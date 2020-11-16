import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceAverageAmountTest {

    @Test
    void averageAmount() {
        StatsService average = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = average.averageAmount(sales);

        assertEquals (expected, actual);
    }
}