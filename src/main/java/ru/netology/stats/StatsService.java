package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }

        System.out.println("Сумма всех продаж: " + sum);
        return sum;

    }


    public int calculateMiddleSum(int[] sales) {
        int middleSum = calculateSum(sales) / 12;
        {
            System.out.println("Средняя сумма продаж в месяц: " + middleSum);
        }

        return middleSum;

    }


    public int findMonthMax(int[] sales) {
        int salesMax = sales[0];
        int month = 0;
        int monthMax = 1;
        for (int sale : sales) {
            month++;
            if (salesMax <= sale) {
                salesMax = sale;
                monthMax = month;
            }

        }

        System.out.println("Максимальная продажа в месяце: " + monthMax);
        return monthMax;
    }


    public int findMonthMin(int[] sales) {
        int salesMin = sales[0];
        int month = 0;
        int monthMin = 1;
        for (int sale : sales) {
            month++;
            if (salesMin >= sale) {
                salesMin = sale;
                monthMin = month;
            }

        }

        System.out.println("Минимальная продажа в месяце: " + monthMin);
        return monthMin;
    }


    public int findOverMiddleSum(int[] sales) {
        int middleSum = calculateMiddleSum(sales);
        int count = 0;
        for (int sale : sales) {
            if (middleSum < sale) {
                count += 1;
            }

        }

        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + count);
        return count;
    }

    public int findUnderMiddleSum(int[] sales) {
        int middleSum = calculateMiddleSum(sales);
        int count = 0;
        for (int sale : sales) {
            if (middleSum > sale) {
                count += 1;
            }

        }

        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + count);
        return count;
    }


}



