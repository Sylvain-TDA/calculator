package test;

import fr.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;

public class DivisionTest {
    @Test
    @DisplayName("Division")
    public void DivisionTest() {
        Calculator calculator = new Calculator();

        for (int i = 1; i <= 1000; i++) {
            int a = new Random().nextInt(1000);
            int b = new Random().nextInt(1000);

            if (b != 0) {
                int result = calculator.division(a, b);
                Assertions.assertAll(() -> Assertions.assertEquals(a / b, result)
                );
            } else {
                Assertions.assertThrows(ArithmeticException.class, () -> calculator.division(a, b));
            }
        }
    }
}
