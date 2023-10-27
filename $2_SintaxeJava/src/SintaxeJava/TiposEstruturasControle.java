package SintaxeJava;

import java.util.Random;


public class TiposEstruturasControle {

	public static void main(String[] args) {

		/**
		 * As linguagens de programação possuem estruturas diferentes para controlar
		 * o fluxo de execução,, ou seja, há estruturas de controle destinadas à repetição e
		 * outras que permitem desviar o fluxo de execução. Essas estruturas, cujo comportamento
		 * esquemático podem ser divididos em:
		 * 
		 * Repetição simples:
		 * Efetuam a repetição de diretivas ou blocos, criando os camados laços.
		 * O número de repetições pode ser definido ou determinado pelo programa
		 * durante a execução. Corresponde à diretiva for no Java.
		 * 
		 */
			// Exemplo comando for(true/false){execute}
			System.out.println("Exemplo diretiva for");
			for(int i = 0; i <= (int)Math.PI; i++) {
				System.out.println("Diretiva for :");
				System.out.println("Valor de i = " + i +"\n");
			}
		/**
		 * 
		 * Repetição condicional:
		 * São como as estruturas de repetição simples, mas cuja repetição está associada à
		 * avaliação de uma condição. Geralmente são usadas quando não se conhece de
		 * antemão o número necessário de repetições. 
		 * No Java são representadas pelas diretivas while e do while.
		 * 
		 */
			Random randomI = new Random();
			int i = randomI.nextInt(10);
			// Exemplo diretiva while(true/false){execute}
			while (i <= 10) {
				System.out.println("Exemplo diretiva while");
				System.err.println("Valor de i = " + i);
				i++;
			}
			
			// Exemplo diretiva for como while
			System.out.println("Exemplo diretiva for como while: ");
			int j = i;
			System.out.println("valor randomico: " + j);
			for(; j >= 0;) {
				System.out.println("for como while: " + j);		
				j--;
			}
			
			// Exemplo diretiva do{execute}while(true/false);
			do {
				System.out.println("Exemplo driretiva do{}while()");
				System.out.println("Isso sempre será executado antes de testar a condilção!");
			}while(false);
			
			
		/**
		 * 
		 * Desvio de fluxo:
		 * Destinado ao desvio do fluxo do programa para uma outra parte, quebrando o fluxo sequencial.
		 * O desvio condicional é associado à avaliação de uma expressão, como uma tomada de decisão;
		 * e o desvio incondicional ocorre automaticamente.
		 * No Java existem as diretivas if else e switch para o desvio incondicional.
		 * Ex:
		 */
			// Diretiva if(true/false){execute}else{execute}
			if(!false) {
				System.out.println("Executa o bloco if");
			}else {
				System.out.println("Executa o bloco else");
			}
			// Diretiva if(true/false)(retun: true / return: false)
			boolean isBoolean = false;
			System.out.println( "if ternário retornando valor de um boolean = " + ( (isBoolean ? true : false) ) );
			
			// Diretiva switch(true/false){}
			int varI = 2;
			System.out.println("Diretiva switch");
			switch(varI) {
			case 1:
				System.out.println("Entrou no caso " + varI);
				break;
			case 2:
				System.out.println("Entrou no caso " + varI);
			default: 
				System.err.println("Entrou no default!");
			}

		/**
		 * Execução modular:
		 * A divisão de um programa em partes menores facilita o entendimento, a correção ou modificação.
		 * No Java isso é feito através de classe e métodos além da divisão do código em pacotes e módulos,
		 * A chamada de métodos constitui um desvio incondicional.
		 * 
		 * 
		 * Controle de erros
		 * Desviam o fluxo de execução para a simplificar a inclisão de rotinas de tratamento de erros 
		 * dentro dos programas.
		 * 
		 * A diretiva try catch finaly exige que cada bloco try possua ao menos um bloco catch ou finaly,
		 * sendo sua sintaxe a seguinte:
		 */
			// Exemplo controle de erros com try catch finaly
			try {
				int []nota; // = new int[70]; 
				nota = new int[70];
				nota[3] = 5;
				nota[70] = 0; // java.lang.ArrayIndexOutOfBoundsException
			}
			catch(ArrayIndexOutOfBoundsException e) {
			// é opcional	
				System.out.println("Deu erro ao tentar referenciar uma posição inexistente do vetor");
				System.out.println(e);
			} 
			finally {
				System.out.println("Sempre entra aqui no finaly");
			}
			
		/**
		 * Uso da diretiva break
		 *
		 */
			
		/**
		 * Uso da diretiva continue
		 */

	}

}
