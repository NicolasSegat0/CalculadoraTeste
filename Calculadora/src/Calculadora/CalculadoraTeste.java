package Calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTeste {
	
	
	// Teste com números positivos.
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSomaPositivo() {
		Calculadora calc = new Calculadora();
		int resultado = calc.soma(1, 6); 
		Assert.assertEquals(7, resultado);
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testSubPositivo() {
		Calculadora calc = new Calculadora();
		int resultado = calc.subt(6, 2); 
		Assert.assertEquals(4, resultado);
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testMultibPositivo() {
		Calculadora calc = new Calculadora();
		int resultado = calc.multi(5, 5); 
		Assert.assertEquals(25, resultado);
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testDivPositivo() {
		Calculadora calc = new Calculadora();
		int resultado = (int) calc.divisao(10, 5); 
		Assert.assertEquals(2, resultado);
	}
	
	
	
	// Testes com números negativos. 
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testSomaNegativo() {
		Calculadora calc = new Calculadora(); 
		int resultado = calc.soma(-1, 9);
		Assert.assertEquals(8, resultado);
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testSubNegativo() {
		Calculadora calc = new Calculadora(); 
		int resultado = calc.subt(-7, 10);
		Assert.assertEquals(-17, resultado);
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testMultibnegativo() {
		Calculadora calc = new Calculadora(); 
		int resultado = calc.multi(-8, 8);
		Assert.assertEquals(-64, resultado);
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testDivbNegativo() {
		Calculadora calc = new Calculadora(); 
		int resultado = (int) calc.divisao(-4, 2);
		Assert.assertEquals(-2, resultado);
	}
	
	
	//Teste com zero. 
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testSomaZero() {
		Calculadora calc = new Calculadora(); 
		int resultado = calc.soma(0, 0);
		Assert.assertEquals(0, resultado);
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testSubZero() {
		Calculadora calc = new Calculadora(); 
		int resultado = calc.subt(0, 0);
		Assert.assertEquals(0, resultado);
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testMultiZero() {
		Calculadora calc = new Calculadora(); 
		int resultado = calc.multi(0, 0);
		Assert.assertEquals(0, resultado);
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void testDivZero() {
		Calculadora calc = new Calculadora(); 
		int resultado = (int) calc.divisao(0, 0);
		Assert.assertEquals(0, resultado);
	}

}
