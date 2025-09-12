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
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 3;
        int b = 2;
        //THEN
        int result = calculator.addition(a, b);
        Assertions.assertAll(() -> Assertions.assertEquals(5, a + b),
                () -> Assertions.assertEquals(3, result - b),
                () -> Assertions.assertEquals(2, result - a));
    }
}
