package class4_1.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void shouldCalculateMinSales() {
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 9;
        StatsService statsService = new StatsService();

        int minMonth = statsService.minSales(stats);
        assertEquals(expectedMonth,minMonth);

    }

    @Test
    void shouldCalculateMaxSales() {
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 8;
        StatsService statsService = new StatsService();

        int maxMonth = statsService.maxSales(stats);
        assertEquals(expectedMonth,maxMonth);
    }

    @Test
    void shouldCalculateSumOfSales(){
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        StatsService statsService = new StatsService();

        long sum = statsService.sumOfSales(stats);
        assertEquals(expectedSum,sum);
    }

    @Test
    void shouldCalculateAverageMonthSumOfSales(){
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageMonthSumOfSales = 15;
        StatsService statsService = new StatsService();

        long sum = statsService.sumOfSales(stats);
        long averageMonthSum = statsService.averageMonthSumOfSales(sum);
        assertEquals(expectedAverageMonthSumOfSales,averageMonthSum);
    }

    @Test
    void shouldCalculateMonthNumberWithSalesOverAverage(){
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthNumberWithSalesOverAverage = 5;
        StatsService statsService = new StatsService();

        long sum = statsService.sumOfSales(stats);
        long averageMonthSum = statsService.averageMonthSumOfSales(sum);
        long monthNumber= statsService.monthNumberOverAverageSales(stats,averageMonthSum);
        assertEquals(expectedMonthNumberWithSalesOverAverage,monthNumber);
    }

    @Test
    void shouldCalculateMonthNumberWithSalesUnderAverage(){
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthNumberWithSalesUnderAverage = 5;
        StatsService statsService = new StatsService();

        long sum = statsService.sumOfSales(stats);
        long averageMonthSum = statsService.averageMonthSumOfSales(sum);
        long monthNumber = statsService.monthNumberUnderAverageSales(stats,averageMonthSum);
        assertEquals(expectedMonthNumberWithSalesUnderAverage,monthNumber);
    }

}
