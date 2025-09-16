package test;

import java.util.Random;

import fr.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    @DisplayName("Addition de deux positifs")
    public void additionPositifTest() {
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 3;
        int b = 2;
        //THEN
        int result = calculator.addition(a, b);
        Assertions.assertAll(() -> Assertions.assertEquals(5, result),
                () -> Assertions.assertEquals(3, result - b),
                () -> Assertions.assertEquals(2, result - a));
    }

    @Test
    @DisplayName("Addition de un positif et un négatif")
    public void additionUnPositifEtUnNegatifTest() {
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 3;
        int b = -2;
        //THEN
        int result = calculator.addition(a, b);
        Assertions.assertAll(() -> Assertions.assertEquals(1, result),
                () -> Assertions.assertEquals(3, result - b),
                () -> Assertions.assertEquals(-2, result-a));
    }

    @Test
    @DisplayName("Addition de deux négatifs")
    public void additionDeuxNegatifsTest() {
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = -3;
        int b = -2;
        //THEN
        int result = calculator.addition(a, b);
        Assertions.assertAll(() -> Assertions.assertEquals(-5, result),
                () -> Assertions.assertEquals(-3, result - b),
                () -> Assertions.assertEquals(-2, result-a));
    }

    @Test
    @DisplayName("Addition de deux zéros")
    public void additionDeuxZeroTest() {
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 0;
        int b = 0;
        //THEN
        int result = calculator.addition(a, b);
        Assertions.assertAll(() -> Assertions.assertEquals(0, result),
                () -> Assertions.assertEquals(0, result - b),
                () -> Assertions.assertEquals(0, result-a));
    }
}
