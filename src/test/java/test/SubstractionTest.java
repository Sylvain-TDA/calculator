package test;

import fr.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class SubstractionTest {
    @Test
    @DisplayName("Soustraction de deux positifs")
    public void SoustractionPositifTest() {
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 3;
        int b = 2;
        //THEN
        int result = calculator.subtraction(a, b);
        Assertions.assertAll(() -> Assertions.assertEquals(1, result),
                () -> Assertions.assertEquals(3, result + b),
                () -> Assertions.assertEquals(2, a-result));
    }

    @Test
    @DisplayName("Soustraction de un positif et un négatif")
    public void subtractionUnPositifEtUnNegatifTest() {
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 3;
        int b = -2;
        //THEN
        int result = calculator.subtraction(a, b); //5
        Assertions.assertAll(() -> Assertions.assertEquals(5, result),
                () -> Assertions.assertEquals(3, result + b),
                () -> Assertions.assertEquals(-2, a-result));
    }

    @Test
    @DisplayName("Soustraction de deux négatifs")
    public void subtractionDeuxNegatifsTest() {
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = -3;
        int b = -2;
        //THEN
        int result = calculator.subtraction(a, b);
        Assertions.assertAll(() -> Assertions.assertEquals(-1, result),
                () -> Assertions.assertEquals(-3, result+b),
                () -> Assertions.assertEquals(-2, a-result));
    }

    @Test
    @DisplayName("Soustraction de deux zéros")
    public void subtractionDeuxZeroTest() {
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int a = 0;
        int b = 0;
        //THEN
        int result = calculator.subtraction(a, b);
        Assertions.assertAll(() -> Assertions.assertEquals(0, result),
                () -> Assertions.assertEquals(0, result+b),
                () -> Assertions.assertEquals(0, a-result));
    }
}


