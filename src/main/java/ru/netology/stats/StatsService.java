package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int Sum = 0;
        for (int sale : sales) {
            Sum += sale;
        }
        System.out.println("Сумма всех продаж: " + Sum);
        return Sum;
    }

    public int calculateMiddleSum(int[] sales) {
        int MiddleSum = calculateSum(sales) / 12; {
        System.out.println("Средняя сумма продаж в месяц: " + MiddleSum); }
        return MiddleSum;
    }


    public int findMonthMax(int[] sales) {
        int SalesMax = sales[0];
        int Month = 0;
        int MonthMax = 1;
        for (int sale : sales) {
            Month++;
            if (SalesMax <= sale) {
                SalesMax = sale;
                MonthMax = Month;
            }
        }
        System.out.println("Максимальная продажа в месяце: " + MonthMax);
        return MonthMax;
    }

    public int findMonthMin(int[] sales) {
        int SalesMin = sales[0];
        int Month = 0;
        int MonthMin = 1;
        for (int sale : sales) {
            Month++;
            if (SalesMin >= sale) {
                SalesMin = sale;
                MonthMin = Month;
            }
        }
        System.out.println("Минимальная продажа в месяце: " + MonthMin);
        return MonthMin;
    }

    public int findOverMiddleSum(int[] sales) {
        int MiddleSum = calculateMiddleSum(sales);
        int Count = 0;
        int OverMiddleSum = 0;
        for (int Sale : sales) {
            if (MiddleSum < Sale) {
                Count++;
                OverMiddleSum = Count;
            }
        }
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + OverMiddleSum);
        return OverMiddleSum;
    }

    public int findUnderMiddleSum(int[] sales) {
        int MiddleSum = calculateMiddleSum(sales);
        int Count = 0;
        int UnderMiddleSum = 0;
        for (int sale : sales) {
            if (MiddleSum > sale) {
                Count++;
                UnderMiddleSum = Count;
            }
        }
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + UnderMiddleSum);
        return UnderMiddleSum;
    }


    }



