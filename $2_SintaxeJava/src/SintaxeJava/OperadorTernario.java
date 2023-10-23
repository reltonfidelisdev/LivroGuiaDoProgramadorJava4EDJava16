package SintaxeJava;

public class OperadorTernario {

	public static void main(String[] args) {

		/**
		 * O operador ternário á um avaliador de condições que permite utilizar o valor de
		 * uma entre expressões diferentes, conforme o resultado da condição avaliada.
		 * 
		 *  Sua sintaxe é:
		 * 		<condicao ? expressaoTrue : expressaoFalse>
		 * 	Quando a condição avaliada resulta em verdadeiro (true), o operador retorna
		 * 	o resultado de expressaoTrue, caso contrário, quando o resultado é falso (false), é
		 * 	retornado o resultado de expressaoFalse.
		 * 
		 * 	Esse operador é conveniente para selecionar o valor de atribuiçãoa outras variáveis ou 
		 * 	para impressão de mensagens do tipo é/não é, como nestes exemplos: 
		 * 
		 */
		
		//Dois valores quaisquer
		double x = Math.PI, y = x--;
		System.out.println(x);
		System.out.println(y);
		
		//Armazena em x o maior entre x e y
		double max = x > y ? x : y;
		System.out.println(max);
		
		int a = 100;
		// Exibe se o valor a é maior que 50
		System.out.println("\nA = " + a + (a > 50 ? " é" : "não é") + " maior que 50");
		
		// Exime se está ou não logado
		boolean isLoged =! false;
		System.out.println("\nVocê " + (isLoged == true ? "está" : "não está") + " Logado");
		System.out.println("\nVocê " + (isLoged != true ? "está" : "não está") + " Logado");
		

	}

}
