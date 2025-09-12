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
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 3;
        int b = 2;
        //THEN
        int result = calculator.subtraction(a, b);
        Assertions.assertAll(() -> Assertions.assertEquals(1, a - b),
                () -> Assertions.assertEquals(3, result + b),
                () -> Assertions.assertEquals(2, a-result));
    }
}


