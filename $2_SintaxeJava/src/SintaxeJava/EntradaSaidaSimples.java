package SintaxeJava;

import java.util.Scanner;	// Importação da classe Scanner do pacote java.util

public class EntradaSaidaSimples {

	public static void main(String[] args) {


		/**
		 * Para solicitar dados do usuário nós podemos utilizar de métodos disponíveis
		 * na classe System do pacote java.util.
		 * A classe Scanner apresenta recursos básicos para entrada e saida de dados
		 * através de um teclado associado ao console.
		 * O programa abaixo mostra como solicitar dados e gardar na memória bem como 
		 * exibir mensagens ou expressões. 
		 */
		
		// Durante a digitação utilize o Code Assist, ativado com Ctrl+Espaço
		// Digitando syso e acionando o Ctrl+Espaço o Code Assist 
		// incluirá o comando System.out.println(); e posicionará o cursor dentro dos parênteses.
		
		System.out.println("Olá");
		System.out.println("Digite um número inteiro: ");
		
		Scanner lerTeclado = new Scanner(System.in);
		
		int valorDigitado = lerTeclado.nextInt();
		System.out.println("Valor digitado: " + valorDigitado);
		
		lerTeclado.close(); // É importante fechar sempre o objeto leitor.
	}

}
