package ru.netology.stats;

// Сервис расчета суммы всех продаж за год
public class StatsService {
    public long amountPerYear(long[] sales) {
        int sumYear = 0;
        for (long sale : sales) {
            sumYear += sale;
        }
        return sumYear;
    }

    // Сервис расчета средней суммы продаж в месяц
    public long averageAmountYear(long[] sales) {
        return amountPerYear(sales) / sales.length;


    }

    // Сервис расчета номера месяца с максимальными продажами
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // Сервис расчета номера месяца с минимальными продажами
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

    // Сервис расчета количества месяцев с продажами ниже среднего
    public int nMonthsBelowAvg(long[] sales) {
        int nMonthMin = 0; // счетчик количества месяцев
        double averAmount = averageAmountYear(sales);
        for (long sale : sales) {
            if (sale < averAmount) {
                nMonthMin++;
            }
        }
        return nMonthMin;
    }

    // Сервис расчета количества месяцев с продажами выше среднего
    public int nMonthsAboveAvg(long[] sales) {
        int nMonthMin = 0; // счетчик количества месяцев
        double averAmount = averageAmountYear(sales);
        for (long sale : sales) {
            if (sale > averAmount) {
                nMonthMin++;
            }
        }
        return nMonthMin;
    }
}
