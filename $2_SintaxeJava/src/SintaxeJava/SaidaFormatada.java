package SintaxeJava;

public class SaidaFormatada {

	public static void main(String[] args) {


		/**
		 * Além da saída não formatada com print() e println(), a partir da versão 5 do Java
		 * é oferecida uma forma conveniente para realização da saída formatada de dados
		 * com o método printf(), que pode ser utilizado por meio do objeto out disponível 
		 * na classe System. Sua sintaxe é:
		 *
		 *  System.out.printf(null, null, args);
		 * 
		 * A formatação é uma String que uma mensagem intercalada ou não por marcadores
		 * para inclusão de valores.
		 * Quando esses marcadores estão presentes, deve ser fornecido o mesmo número
		 * de expressões para prover valores a esses marcadores.
		 * 
		 * Quando a mensagem é impressa cada marcador é substituido pelo resultado
		 * da expressão correspondente, formatado conforme o tipo do marcador.
		 * 
		 * Exemplos:
		 */
		
		// Exibe a mensagem Java Guia do Programador e quebra linha
		System.out.printf("Java Guia do Programador 4%n");
		//Exibe mensagem, valor e quebra linha
		System.out.printf("Valor Inteiro: %d %n", 20);
		//Exibe mensagem, dois valores inteiro, um valor real e quebra linha
		int x = 10, y = 3;
		System.out.printf("%d/%d = %f%n", x, y, (float)(x/y));
		
		// Esse método, como mostrado, é análogo à função printf() do C.
		// Marcadores comuns são:
		//	%d para inteiros
		int inteiro = Integer.SIZE;
		System.out.printf("Um número inteiro : %d%n", inteiro);
		
		//	%f para reais de qualquer tipo
		double pi = Math.PI;
		System.out.printf("O valor de PI é: %f%n", pi);
		
		//	%c para caracteres
		char option = 'Y';
		System.out.printf("Opção : %c%n", option);

		//	%s para String
		String texto = "Um texto aqui";
		System.out.printf("Aqui vai uma String: %s%n", texto);
		
		// %n quebra linha
		// ...
	}

}
