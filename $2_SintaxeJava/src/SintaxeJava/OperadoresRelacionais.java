package SintaxeJava;

public class OperadoresRelacionais {

	public static void main(String[] args) {

		/**
		 * Operadores relacionais comparam valores literais, variáveis ou o resultado de
		 * expressões e produzem um resultado do tipo lógico, por exemplo, verdadeiro ou falso.
		 * 
		 * Tabela dos Operadores Relacionais:
		 * 
		 * 	Operador		Significado			Associatividade		Exemplo
		 * 	==				Igual a				Esquerda			a == b
		 * 	!=				Diferente			Esquerda			a != b
		 * 	>				Maior que			Esquerda			a >  b
		 * 	>=				Maior ou igual a	Esquerda			a >= b
		 * 	<				Menor que			Esquerda			a <  b
		 * 	<=				Menor ou igual a	Esquerda			a <= b
		 * 	
		 * Os operadores de igualdade == e diferença são semelhantes aos existentes
		 * na linguagem C/C++. Os demais são idênticos à grande maioria das
		 * linguagens de programação em uso.
		 * 
		 * 	O fragmento de código que segue contém expressões válidas:
		 */	
		
		double k = 1.5, m = -1.9;
		
		boolean res0 = k == m;
		System.out.println(res0);
		
		boolean res1 = k >= m;
		System.out.println(res1);
		
		boolean res2 = k < m;
		System.out.println(res2);
		
		boolean res3 = k <= m;
		System.out.println(res3);
		
		boolean res4 = k != m;
		System.out.println(res4);
		System.out.flush();
		System.out.close();
	}

}
