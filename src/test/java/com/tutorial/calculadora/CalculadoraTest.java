package com.tutorial.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    //Identifica que é um Teste
    @Test
    public void deveriaSomarDoisValores(){

        int valor1 = 2;
        int valor2 = 3;

        Calculadora calculadora = new Calculadora();
        Integer resultadoSoma = calculadora.somar(valor1, valor2);

        Assertions.assertEquals(resultadoSoma, 5);
    }
}
