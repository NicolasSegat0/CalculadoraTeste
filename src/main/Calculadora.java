package main;

public class Calculadora {
	 public static double calcular(String operacao, double a, double b) {
	        switch (operacao.toLowerCase()) {
	            case "soma":
	                return Soma.somar(a, b);
	            case "subtracao":
	                return Subtracao.subtrair(a, b);
	            case "divisao":
	                return Divisao.dividir(a, b);
	            case "multiplicacao":
	                return Multiplicacao.multiplicar((int) a, (int) b);
	            default:
	                throw new IllegalArgumentException("Operação desconhecida: " + operacao);
	        }
	    }

}
