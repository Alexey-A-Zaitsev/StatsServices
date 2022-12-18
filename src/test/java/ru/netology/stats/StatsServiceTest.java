package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    // сумма продаж за год
    public void shouldFindSumYear() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        long actualSum = service.amountPerYear(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    // Средняя сумма продаж за год
    public void shouldFindAverageAmountMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        double actualSum = service.averageAmountYear(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    // Номер месяца с максимальными продажами
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 8;
        int actualSum = service.maxSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    // Номер месяца с минимальными продажами
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 0, 55};
        int expectedSum = 11;
        int actualSum = service.minSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    // Количество месяцев с продажами ниже среднего
    public void shouldFindAmountMonthsBelowAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 0, 55};
        int expectedSum = 7;
        int actualSum = service.nMonthsBelowAvg(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    // Количество месяцев с продажами ниже среднего
    public void shouldFindAmountMonthsAboveAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 0, 55};
        int expectedSum = 5;
        int actualSum = service.nMonthsAboveAvg(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }
}
