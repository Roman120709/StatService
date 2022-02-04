package ru.netology.stat;

public class StatService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {

        long average = sumSales(sales) / sales.length;
        return average;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowAverageSales(long[] sales) {

        int month = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                month = month + 1;
            }

        }

        return month;
    }

    public int upAverageSales(long[] sales) {

        int month = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                month = month + 1;
            }

        }

        return month;
    }
}