package class4_1.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long sumOfSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
            }
        return sum;
    }

    public long averageMonthSumOfSales(long sum){
        return sum/12;
    }

    public long monthNumberOverAverageSales(long[] sales, long averageMonthSumOfSales){
        long monthNumber = 0;
        for (long sale: sales){
            if(sale > averageMonthSumOfSales){
                monthNumber = monthNumber+1;
            }
        }
        return monthNumber;
    }

    public long monthNumberUnderAverageSales(long[] sales, long averageMonthSumOfSales){
        long monthNumber = 0;
        for (long sale: sales){
            if(sale < averageMonthSumOfSales){
                monthNumber = monthNumber+1;
            }
        }
        return monthNumber;
    }


}
