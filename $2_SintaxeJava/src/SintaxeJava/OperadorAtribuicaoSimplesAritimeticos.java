package SintaxeJava;

public class OperadorAtribuicaoSimplesAritimeticos {

	public static void main(String[] args) {

		/**
		 * Atribuição é a operação que define o calor de uma variável por meio da avaliação
		 * do resultado de uma expressão envolvendo literais, contantes, variáveis, métodos
		 * e operações diversas.
		 * 
		 * A atribuição simples armazena o resultado de uma avaliação de uma expressão em
		 * uma variável e usa a sintaxe:
		 * 
		 * 	variavel = expressao ;
		 * 
		 * Essa sintaxe equivale a "variavel recebe(resultado da) expressão" e pode ser
		 * empregada tanto na declaração de variáveis novas (sua inicialização), como para
		 * variáveis existentes.
		 * 
		 * Tabela de Operadores Aritméticos		Exemplo:
		 * 	
		 * 	+ Adição							a + b
		 * 	- Subtração							a - b
		 * 	* Multiplicação						a * b
		 * 	/ Divisão							a / b
		 * 	% Resto da divisão ou Módulo		a % b
		 * 	- Sinal negativo					-a
		 * 	+ Sinal positivo					+b
		 * 	++ Incremento unário				++a ou a++
		 * 	-- Decremento unário				--a ou a--
		 * 	
		 * 
		 */
		
		boolean result = false;
		var a = 150;
		int b = 30;
		double c = 10.50;
		int total = 0;
		
		System.out.printf("Valores a calcular: \"a = %d\" \"b = %d\" \"c = %f\" %n%n", a, b, c);
		
		System.out.printf("O valor da soma entre \"a\" e \"b\" é: %d %n%n", total = (a + b)); // 180
		
		System.out.printf("O valor da subtração entre \"a\" e \"b\" é: %d %n%n", total = (a - b)); // 120
		
		System.out.printf("O valor da multiplicação entre \"a\" e \"b\" é: %d %n%n", total = (a * b)); // 4500
		
		System.out.printf("O valor da divisão entre \"a\" e \"b\" é: %d %n%n", total = (a / b)); // 5
		
		System.out.printf("O resto da divisão entre \"a\" e \"b\" é: %d %n%n", total = (a % b)); // 0
		

	}

}
