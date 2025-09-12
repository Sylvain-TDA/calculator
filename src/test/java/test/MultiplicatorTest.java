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
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 5;
        int b = 2;
        //THEN
        int result = calculator.multiplication(a, b);
        Assertions.assertAll(() -> Assertions.assertEquals(10, a*b),
                () -> Assertions.assertEquals(2, result/a),
                () -> Assertions.assertEquals(5, result/b));
    }
}
