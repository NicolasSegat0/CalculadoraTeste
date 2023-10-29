package Calculadora;

/**
 * @author Nicolas Navas Segato. 
 * @version 1.05. 
 * @since Release 1.02 da aplicação.
 * 
 * Uma classe simples que realiza adição, subtração, multiplicação e divisão.
 */

public class Calculadora {
	
	/**
	 * Método utilizado para calcular adição de dois números. 
	 * @param a Primeiro número inserido. 
	 * @param b Segundo número inserido. 
	 * @return Retorna o resultado.
	 */
	public int soma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Método utilizado para calcular subtração de dois números. 
	 * @param a Primeiro número inserido. 
	 * @param b Segundo número inserido. 
	 * @return Retorna o resultado.
	 */
	public int subt(int a, int b) {
		return a - b; 
	}
	
	/**
	 * Método utilizado para calcular multiplicação de dois números. 
	 * @param a Primeiro número inserido. 
	 * @param b Segundo número inserido. 
	 * @return Retorna o resultado.
	 */
	public int multi(int a, int b) {
		return a * b; 
	}
	
	/**
	 * Método utilizado para calcular divisão de dois números. 
	 * @param a Primeiro número inserido. 
	 * @param b Segundo número inserido. 
	 * @return Retorna o resultado.
	 */
	public double divisao(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Não é possíevl efetuar a operação");
		}
		return (double) a / b;
	}
}
