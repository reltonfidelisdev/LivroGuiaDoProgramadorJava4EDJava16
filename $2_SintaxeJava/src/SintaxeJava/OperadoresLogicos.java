package SintaxeJava;

public class OperadoresLogicos {

	public static void main(String[] args) {

		/**
		 * Os operadores lógicos conectam logicamente de diferentes expressões
		 * aritméticas ou relacionais, o que permite construir expressões
		 * compostas de várias partes e, portanto, mais complexas.
		 * 
		 * Operadores lógicos:
		 * 
		 * 	Operador	Significado		Associatividade		exemplo
		 * 	&&			E lógico (and)	Esquerda			a && z
		 * 	||			Ou lógico (or)	Esquerda			a || z
		 * 	!			Negação			Direita				!a
		 * 	^			Ou exclusivo	Direita				a ^ z
		 * 			
		 */
		
		// Exemplos de expressões lógicas
		
		double k = 1.5, m = -1.9;
		System.out.printf("Valor de k = %f%n", k);
		
		boolean rUm = (k > 0) && (m < 0);
		System.out.println(rUm);
		
		boolean	rDois = (k == m) || (m > 0);
		System.out.println(rDois);
		
		boolean rTres = true == !rUm;
		System.out.println(!rTres);
		
		boolean rQuatro = !rTres == ( true ? rTres : false);
		System.out.println(rQuatro);
		

	}

}
