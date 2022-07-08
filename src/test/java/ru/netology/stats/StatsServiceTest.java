package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test //1. Тестируем сумму всех продаж
    public void shouldSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        assertEquals(expected, actual);
    }

    @Test //2. Тестируем среднюю сумму продаж в месяц
    public void shouldAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        assertEquals(expected, actual);
        // Средняя сумма продаж в месяц: 15
    }

    @Test  //3. Тестируем номер месяца, в котором был пик продаж
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSalesMonth(sales);
        long expected = 7;
        assertEquals(expected, actual);
    }

    @Test  //4. Тестируем номер месяца, в котором был минимум продаж
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSalesMonth(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test  //5. Тестируем кол-во месяцев, в которых продажи были ниже среднего
    public void shouldbelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.belowAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test  //6. Тестируем кол-во месяцев, в которых продажи были выше среднего
    public void shouldaboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.aboveAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }

}
