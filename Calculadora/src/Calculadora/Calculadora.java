package Calculadora;

public class Calculadora {
	
	// Operação de adição 
	public int soma(int a, int b) {
		return a + b;
	
	}
	
	// Operação de subtração.
	public int subt(int a, int b) {
		return a - b; 
	}
	
	//Operação de multiplicação.
	public int multi(int a, int b) {
		return a * b; 
	}
	
	//Operação de divisao com tratamento de erro ao dividir um número por zero.
	public double divisao(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Não é possíevl efetuar a operação");
		}
		return (double) a / b;
	}
}