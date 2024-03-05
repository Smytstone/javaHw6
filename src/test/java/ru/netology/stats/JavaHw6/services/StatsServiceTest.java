package ru.netology.stats.JavaHw6.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void shouldFindMinMonthSales() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonthSales() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAllSalesSum() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.allSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMidSalesPerMonth() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.midSalesPerMonth(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSalesUnderMid() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.minSalesUnderMid(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSalesAboveMid() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.maxSalesAboveMid(arr);

        Assertions.assertEquals(expected, actual);
    }

}
