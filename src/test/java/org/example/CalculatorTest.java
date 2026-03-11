package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void add_two_integers_returns_sum() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void subtract_two_integers_returns_difference() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(5, 3);

        assertEquals(2, result);
    }

    @Test
    void multiply_two_integers_returns_product() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(4, 5);

        assertEquals(20, result);
    }

    @Test
    void divide_two_integers_returns_quotient() {
        Calculator calculator = new Calculator();

        int result = calculator.divide(10, 2);

        assertEquals(5, result);
    }

    @Test
    void divide_by_zero_throws_exception() {
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
