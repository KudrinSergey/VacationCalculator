import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.services.javaqa.javamvn.service.VacationCalculator;

import javax.management.ConstructorParameters;

public class VacationCalculatorTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/month.csv")
    public void testNumberOfMonths(int expected, int income, int expenses, int threshold) {
        VacationCalculator service = new VacationCalculator();
        int actual = service.calculateMonthsOfVacation(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}

