import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.netology.statsService.StatsService;


public class StatsServiceTest {
    @Test
    void shouldCalculateTotalSum() {
        StatsService calculate = new StatsService();
        int expected = 78;
        int[] yearsSales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int actual = calculate.calculateTotalSum(yearsSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {
        StatsService calculate = new StatsService();
        int expected = 6;
        int[] yearsSales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int actual = calculate.calculateAverageSales(yearsSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMax() {
        StatsService calculate = new StatsService();
        int expected = 12;
        int[] yearsSales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int actual = calculate.calculateMaxMonthBySales(yearsSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMin() {
        StatsService calculate = new StatsService();
        int expected = 1;
        int[] yearsSales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int actual = calculate.calculateMinMonthBySales(yearsSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateLowerThanAvg() {
        StatsService calculate = new StatsService();
        int expected = 6;
        int[] yearsSales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int actual = calculate.calculateMonthLowerThanAverage(yearsSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateHigherThanAvg() {
        StatsService calculate = new StatsService();
        int expected = 5;
        int[] yearsSales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int actual = calculate.CalculateMonthHigherThanAverage(yearsSales);
        assertEquals(expected, actual);
    }
}
