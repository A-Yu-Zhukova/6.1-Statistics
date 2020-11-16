public class StatsService {
    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        int average = salesSum(sales) / 12;
        return average;
    }

    public int maxSales(int[] sales) {
        int peakSales = sales[0];
        int month = 1;
        int peakMonth = 1;
        for (int sale : sales) {
            if (peakSales <= sale) {
                peakMonth = month;
                peakSales = sale;
            }
            month++;
        }
        return peakMonth;
    }

    public int minSales(int[] sales) {
        int peakSales = sales[0];
        int month = 1;
        int peakMonth = 1;
        for (int sale : sales) {
            if (peakSales >= sale) {
                peakMonth = month;
                peakSales = sale;
            }
            month++;
        }
        return peakMonth;
    }

    public int belowAverage(int[] sales) {
        int belowAverageMonth = 0;
        int average = averageAmount(sales);
        for (int sale : sales) {
            if (average < sale) {
                belowAverageMonth++;
            }
        }
        return belowAverageMonth;
    }
    public int aboveAverage(int[] sales) {
        int aboveAverageMonth = 0;
        int average = averageAmount(sales);
        for (int sale : sales) {
            if (average > sale) {
                aboveAverageMonth++;
            }
        }
        return aboveAverageMonth;
    }

}