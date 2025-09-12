package test;

import java.util.Random;

import fr.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    @Test
    @DisplayName("Addition")
    public void additionTest() {
        Calculator calculator = new Calculator();

        for (int i = 1; i <= 1000; i++) {
            int a = new Random().nextInt(1000);
            int b = new Random().nextInt(1000);

            int result = calculator.addition(a, b);
            Assertions.assertAll(() -> Assertions.assertEquals(a + b, result),
                    () -> Assertions.assertEquals(result - b, a),
                    () -> Assertions.assertEquals(result - a, b));
        }
    }
}
