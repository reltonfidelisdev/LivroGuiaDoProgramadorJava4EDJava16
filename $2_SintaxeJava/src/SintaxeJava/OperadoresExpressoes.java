package SintaxeJava;

public class OperadoresExpressoes {

	public static void main(String[] args) {


		/**
		 * A linguagem Java oferece um conjunto amplo de operadores destinados à realização
		 * de operaçções de atribuição, aritméticas, lógicas, relacionais e bite-a-bit (Bitwise).
		 * Esses operadores são representados po símbolos compostos de um até quatro caracteres, 
		 * como soma (Sinal de "+") ou E Lógico (Sinal de &&).
		 *  
		 *  Os operadores de atribuição, lógicos, aritméticos, relacionais e bit-a-bit do Java
		 *  são idênticos aos encontrados no C/C++, e C#, podendo ser utilizados nas mesmas situações.
		 *  
		 */
		
		boolean bFalse = false;
		System.out.println(bFalse);
		// Imprime false
		boolean bValue = (bFalse = (1 + 2 == 3) ? true : false);
		// Imprime true
		System.out.println(bValue);
		
	}

}
