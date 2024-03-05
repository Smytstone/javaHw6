package ru.netology.stats.JavaHw6.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int allSales(long[] sales) {
        long salesSum = 0;

        for (int i = 0; i < sales.length; i++) {
            salesSum += sales[i];
        }

        return (int) salesSum;
    }

    public int midSalesPerMonth(long[] sales) {
        long salesMidSum = 0;

        for (int i = 0; i < sales.length; i++) {
            salesMidSum += sales[i];
        }

        return (int) salesMidSum / sales.length;
    }

    public int minSalesUnderMid(long[] sales) {
        int minMonths = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {

            int midSumDay = midSalesPerMonth(sales);

            if (sales[i] < midSumDay) {
                minMonths += 1;
            }
        }

        return minMonths;
}

    public int maxSalesAboveMid(long[] sales) {
        int minMonths = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {

            int midSumDay = midSalesPerMonth(sales);

            if (sales[i] > midSumDay) {
                minMonths += 1;
            }
        }

        return minMonths;
    }


}
