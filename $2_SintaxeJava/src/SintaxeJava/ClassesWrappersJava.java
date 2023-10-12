package SintaxeJava;

public class ClassesWrappersJava {

	public static void main(String[] args) {
		/**
		 * Classes Wrappers em Java
		 * Os Wrapper são conhecidos na linguagem Java como classes especiais 
		 * que possuem métodos capazes de fazer conversões em variáveis primitivas 
		 * e também de encapsular tipos primitivos para serem trabalhados como objetos, 
		 * ou seja, é feita um embrulho de streams que são fluxo de dados através de canais.
			Sendo assim, existe uma classe Wrapper para cada tipo primitivo 
			identificado pelo mesmo nome do tipo que possui e tendo a primeira letra maiúscula.
			Essa regra de declaração é aplicada a todos os tipos, exceto aos que são char classificados como Character 
			e boolean como Boolean.
		 */
		/**
		 *  cada tipo wrapper numérico em Java são subclasses 
		 *  da superclasse abstrataNumber (Java.lang.Number) que 
		 *  consegue acessar todos os métodos values 
		 *  que são: doubleValue(), floatValue(), longValue(), 
		 *  intValue(), shortValue() e byteValue().
		 */
		
		String numInt = "9822";
		
		//Representação do tipo que está sendo criado
		@SuppressWarnings("removal")
		Float fNum = new Float("500.50");
		
		@SuppressWarnings("removal")
		Integer iNum = new Integer(numInt);
		
		@SuppressWarnings("removal")
		Double dNum = new Double("5122.22");
		
		// O argumento somente aceita do tipo char, por isso é usado aspas simples
		@SuppressWarnings("removal")
		Character cNum = new Character('a');
		System.out.println(Character.toUpperCase(cNum));
		
		// Criação do tipo primitivo natural
		Float floatMaxValue = Float.MAX_VALUE;
		System.out.print("O valor máximo para uma variável do tipo Float é: " + floatMaxValue);

	}

}
