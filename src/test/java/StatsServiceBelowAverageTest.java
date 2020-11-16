import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceBelowAverageTest {

    @Test
    void belowAverage() {
        StatsService below = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = below.belowAverage(sales);

        assertEquals(expected, actual);
    }
}