package SintaxeJava;

public class OperadoresBitwise {

	public static void main(String[] args) {

		/**
		 * Considere duas variáveis a e b, do typo byte com 8 bits de conteúdocada:
		 * a8a7a6a5a4a3a2a1a0 e b8b7b6b5b4b3b2b1b0. 
		 * Operações bitwise (ou bit-a-bit) efetuam operações entre os bits dos seus operandos.
		 * 
		 * Operadores bitwise:
		 * 
		 * Operador		Significado							Associatividade		Exemplo
		 * 	
		 * 	&			E bit-a-bit							Esquerda			a & b
		 * 	|			Ou bit-a-bit						Esquerda			a | b
		 * 	^			Ou-exclusivo bit-abit (bitwise xor)	Esquerda			a ^ b
		 * 	~			Complemento de 2					Direita				~ a
		 * 	<<			Rotação à esquerda de n bits		Esquerda			a << n
		 * 	>>			Rotação à direita de n bits			Esquerda			a >> n
		 * 	>>>			Rotação à direita sem sinal			Esquerda			a >>> n			
		 * 
		 */

		// Uso de operadores bitwise
		byte a = 0x1f, b = 0x10;
		System.out.println("\n Variáveis: a = " + a + ", b = " + b);

		
		// Operações bitwise
		System.out.println(" a & b = " + (a & b));
		System.out.println(" a | b = " + (a | b));
		System.out.println(" a ^ b = " + (a ^ b));
		System.out.println(" ~ b = " 	+ (~ b));
		System.out.println(" a << 2 = " + (a << 2));
		System.out.println(" -a >> 4 = " + (-a >> 4));
		System.out.println(" a >>> 4 = " + (a >>> 4));
	}

}
