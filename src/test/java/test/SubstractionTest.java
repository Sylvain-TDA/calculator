package test;

import fr.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class SubstractionTest {
    @Test
    @DisplayName("Soustraction")
    public void substractionTest() {
        Calculator calculator = new Calculator();

        for (int i = 1; i <= 1000; i++) {
            int a = new Random().nextInt(1000);
            int b = new Random().nextInt(1000);

            int result = calculator.subtraction(a, b);
            Assertions.assertAll(() -> Assertions.assertEquals(a - b, result),
                    () -> Assertions.assertEquals(result + b, a),
                    () -> Assertions.assertEquals(a-result, b));
        }
    }
}

