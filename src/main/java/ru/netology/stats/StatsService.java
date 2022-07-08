package ru.netology.stats;

public class StatsService {

    //1. Сумма всех продаж
    public long sum(long[] sales) {
        long ans = 0;
        for (long sale : sales) {
            ans += sale;
        }
        return ans;
    }

    //2. Средняя сумма продаж в месяц
    public long average(long[] sales) {
        long sum = sum(sales);
        return sum / 12;
    }

    //3. Номер месяца, в котором был пик продаж
    public int maxSalesMonth(long[] sales) {
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = i;
            }
        }
        return maxi;
    }

    //4. Номер месяца, в котором был минимум продаж
    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    //5. Кол-во месяцев, в которых продажи были ниже среднего
    public int belowAverage(long[] sales) {
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    //6. Кол-во месяцев, в которых продажи были выше среднего
    public int aboveAverage(long[] sales) {
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }

}
