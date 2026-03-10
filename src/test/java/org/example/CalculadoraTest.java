package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraTest {

    @Test
    void sumar_dos_enteros_devuelve_suma() {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.sumar(2, 3);

        assertEquals(5, resultado);
    }

    @Test
    void restar_dos_enteros_devuelve_resta() {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.restar(5, 3);

        assertEquals(2, resultado);
    }

    @Test
    void multiplicar_dos_enteros_devuelve_producto() {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.multiplicar(4, 5);

        assertEquals(20, resultado);
    }

    @Test
    void dividir_dos_enteros_devuelve_cociente() {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.dividir(10, 2);

        assertEquals(5, resultado);
    }

    @Test
    void dividir_por_cero_lanza_excepcion() {
        Calculadora calculadora = new Calculadora();

        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}
