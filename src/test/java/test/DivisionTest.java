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
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 10;
        int b = 2;
        //THEN
        int result = calculator.division(a, b); // result = 5
        Assertions.assertAll(() -> Assertions.assertEquals(5, a/b),
                () -> Assertions.assertEquals(10, result*b),
                () -> Assertions.assertEquals(2, a/result));
    }
}
