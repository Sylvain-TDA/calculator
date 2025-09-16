package test;

import fr.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class MultiplicatorTest {

    @Test
    @DisplayName("Multiplication de deux positifs")
    public void MultiplicationPositifTest() {
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 3;
        int b = 2;
        //THEN
        int result = calculator.multiplication(a, b); // 6
        Assertions.assertAll(() -> Assertions.assertEquals(6, result),
                () -> Assertions.assertEquals(2, result/a),
                () -> Assertions.assertEquals(3, result/b));
    }

    @Test
    @DisplayName("Multiplication de un positif et un négatif")
    public void multiplicationUnPositifEtUnNegatifTest() {
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 3;
        int b = -2;
        //THEN
        int result = calculator.multiplication(a, b); //-6
        Assertions.assertAll(() -> Assertions.assertEquals(-6, result),
                () -> Assertions.assertEquals(-2, result/a),
                () -> Assertions.assertEquals(3, result/b));
    }

    @Test
    @DisplayName("Multiplication de deux négatifs")
    public void multiplicationDeuxNegatifsTest() {
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = -3;
        int b = -2;
        //THEN
        int result = calculator.multiplication(a, b);//6
        Assertions.assertAll(() -> Assertions.assertEquals(6, result),
                () -> Assertions.assertEquals(-2, result/a),
                () -> Assertions.assertEquals(-3, result/b));
    }

    /*
    @Test
    @DisplayName("Multiplication de deux zéros")
    public void multiplicationDeuxZeroTest() {
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 0;
        int b = 0;
        //THEN
        int result = calculator.multiplication(a, b);//6
        Assertions.assertAll(() -> Assertions.assertThrows()
            );
    }*/
}
