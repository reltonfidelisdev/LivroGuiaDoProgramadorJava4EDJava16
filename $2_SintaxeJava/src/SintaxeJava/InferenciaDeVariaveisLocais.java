package SintaxeJava;

public class InferenciaDeVariaveisLocais {

	public static void main(String[] args) {

		/**
		 * O Java 10 introduziu um mecanismo que permite a determinação implícita do
		 * tipo da variável local pelo compilador, baseado no tipo de valor atribuído à variável
		 * o que se denomina inferência (de tipo) de variável. 
		 */
		
		// O usual é declarar uma variável com a indicação explícita de seu tipo, como:
		double temperaturaSala = 21.5;
		System.out.println(temperaturaSala);
		// Mas agora é possível escrever:
		var temperaturaCozinha = 2.5;
		System.out.println(temperaturaCozinha);
	}

}
