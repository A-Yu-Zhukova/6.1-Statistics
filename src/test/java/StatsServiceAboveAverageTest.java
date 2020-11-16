import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceAboveAverageTest {

    @Test
    void aboveAverage() {
        StatsService above = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = above.aboveAverage(sales);

        assertEquals(expected, actual);
    }
}