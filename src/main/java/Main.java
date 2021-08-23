import ru.netology.statsService.StatsService;

public class Main {
    public static void main(String[] args) {
        /* Объявляем объекты */
        StatsService calculate = new StatsService();
        /* Объявляем массив продаж по месяцам */
        int[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        /* Высчитываем каждое значение */
        int summ = calculate.calculateTotalSum(yearSales);
        int avg = calculate.calculateAverageSales(yearSales);
        int maxMonth = calculate.calculateMaxMonthBySales(yearSales);
        int minMonth = calculate.calculateMinMonthBySales(yearSales);
        int lowerThanAvg = calculate.calculateMonthLowerThanAverage(yearSales);
        int higherThanAvg = calculate.CalculateMonthHigherThanAverage(yearSales);
        /* Выводим на экран */
        System.out.println(String.format("""
                        Сумма всех продаж: %s\s
                        Средняя сумма продаж за год: %s\s
                        Номер месяца, в которым был максимум продаж: %s\s
                        Номер месяца, в которым был минимум продаж: %s\s
                        Количество месяцев, в которых продажи были ниже среднего: %s\s
                        Количество месяцев, в которых продажи были выше среднего: %s""",
                        summ, avg, maxMonth, minMonth, lowerThanAvg, higherThanAvg));
    }
}
