package test;

import fr.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class MultiplicatorTest {
    @Test
    @DisplayName("Multiplicator")
    public void MultiplicatorTest() {
        Calculator calculator = new Calculator();

        for (int i = 1; i <= 1000; i++) {
            int a = new Random().nextInt(1000);
            int b = new Random().nextInt(1000);

            int result = calculator.multiplication(a, b);
            Assertions.assertAll(() -> Assertions.assertEquals(a * b, result));

            if (b != 0) {
                Assertions.assertEquals(result / b, a);
            } else if (a != 0) {
                Assertions.assertEquals(result / a, b);
            }
        }
    }
}
