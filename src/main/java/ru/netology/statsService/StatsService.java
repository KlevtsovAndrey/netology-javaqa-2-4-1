package ru.netology.statsService;

public class StatsService {
    public int calculateTotalSum(int[] yearSales) {
        int summ = 0;
        for (int month : yearSales) {
            summ += month;
        }
        return summ;
    }

    public int calculateAverageSales(int[] yearSales) {
        int summ = 0;
        for (int month: yearSales) {
            summ += month;
        }
        return summ / yearSales.length;
    }

    public int calculateMaxMonthBySales(int[] yearSales) {
        int monthCounter = 1;
        int initialSales = 0;
        for (int month: yearSales) {
            if (month > initialSales) {
                initialSales = month;
            }
        }
        for (int month: yearSales) {
            if (month == initialSales) {
                break;
            }
            monthCounter += 1;
        }
        return monthCounter;
    }

    public int calculateMinMonthBySales(int[] yearSales) {
        int monthCounter = 1;
        int initialSales = 100;
        for (int month : yearSales) {
            if (month < initialSales) {
                initialSales = month;
            }
        }
        for (int month: yearSales) {
            if (month == initialSales) {
                break;
            }
            monthCounter += 1;
        }
        return monthCounter;
    }

    public int calculateMonthLowerThanAverage(int[] yearSales) {
        int summ = 0;
        int count = 0;
        for (int month: yearSales) {
            summ += month;
        }
        int avgSales = summ / yearSales.length;
        for (int month: yearSales) {
            if (month > avgSales) {
                count += 1;
            }
        }
        return count;
    }

    public int CalculateMonthHigherThanAverage(int[] yearSales) {
        int summ = 0;
        int count = 0;
        for (int month: yearSales) {
            summ += month;
        }
        int avgSales = summ / yearSales.length;
        for (int month: yearSales) {
            if (month < avgSales) {
                count += 1;
            }
        }
        return count;
    }
}