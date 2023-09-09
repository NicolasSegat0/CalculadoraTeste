package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.Calculadora;


public class TestCalculadora {
	public void testCalculadora() {
        assertEquals(5, Calculadora.calcular("soma", 2, 3));
        assertEquals(2, Calculadora.calcular("subtracao", 5, 3));
        assertEquals(6.0, Calculadora.calcular("divisao", 12.0, 2.0));
        assertEquals(10, Calculadora.calcular("multiplicacao", 2, 5));
    }
	 
}
