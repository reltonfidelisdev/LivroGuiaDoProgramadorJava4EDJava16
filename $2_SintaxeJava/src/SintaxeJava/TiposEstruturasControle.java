package SintaxeJava;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class TiposEstruturasControle {

	public static void main(String[] args) {

		/**
		 * As linguagens de programação possuem estruturas diferentes para controlar
		 * o fluxo de execução, ou seja, há estruturas de controle destinadas à repetição e
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
			int j = randomI.nextInt(5);
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
			// trata o erro ArrayIndexOutOfBoundsException
				System.out.println("Erro ao tentar referenciar uma posição inexistente do vetor de notas.");
				//System.out.println(e);
			} 
			finally {
				System.out.println("Sempre entra aqui no finaly");
			}
			
			// Exemplo controle de erros com multi-catch
			try {
				int argumentos = Integer.parseInt(args[0]);
				while(argumentos >= 0 ) {
					System.out.println(argumentos);
					argumentos--;
				}
			} catch (ArrayIndexOutOfBoundsException e1) {
				// Trata erro ArrayIndexOutOfBoundsException
				System.err.println("Nao passou nenhum argumento!");
				System.out.println("Informe uma vogal ou um numero inteiro. \n");
			} catch (NumberFormatException e2) {
				// trata erro NumberFormatException 
				System.out.println("Argumento deve ser um inteiro");
			}

			/**
			 * Uso da diretiva switch
			 * A diretiva switch é um desvio múltiplo de floxo, que avalia uma expressão ordinal
			 * para escolher um caminho de execução entre vários possíveis. 
			 * Uma expressão é ordinal quando seu resultado pertence a um conjunto em que são
			 * conhecidos os elementos anterior e posterior de qualquer um de seus valores.
			 * Ex:
			 * (expressao ?
			 * 	case : 1
			 * 	printf("continue..");
			 * 	case : 2
			 * 	break;
			 * ) 
			 *
			 */
				// Exemplo diretiva switch
				if(args.length > 0){ // testa presença de argumentos
					switch (args[0].charAt(0)) { // Avalia inicial do 1º argumento 
					case 'a': // Argumento com a inicial minúscula 
					case 'A': System.out.println("Vogal A");//
						break;
					case 'e' :
					case 'E' : System.out.println("Vogal E");
						break;
					case 'i' :
					case 'I' : System.out.println("Vogal I");
						break;
					case 'o' :
					case 'O' : System.out.println("Vogal O");
						break;
					case 'u' :
					case 'U' : System.out.println("Vogal U");
						break;
					default:
						System.out.println("Nao e uma vogal");
					}
				}else {
					System.out.println("Nao foi fornecido argumento.");
				}
				
				// Diretiva switch com string
				switch(args[0].toLowerCase()) { // Avalia o texto do 1º argumento em minúsculas
				case "data" : System.out.println(DateFormat.getDateInstance().
						format(new Date()));
				break;
				case "hora" :
				System.out.println(DateFormat.getTimeInstance().
						format(new Date()));
					break;
				case "datanova" :
					System.out.println(LocalDate.now().
							format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
					break;
				case "horanova" :
					System.out.println(LocalTime.now().
							format(DateTimeFormatter.ofPattern("hh:mm:ss")));
					
				default :
					System.out.println("Comando nao conhecido.");
				}

				// Diretiva switch como expressão
				int mes = 1; 
				int nDias;
				switch(mes){
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10:
				case 12:
					nDias = 31;
					break;
				case 4 : case 6: case 9: case 11:
					nDias = 30;
					break;
				default : 
					nDias = 28;
				}
			
			/**
			 * Uso da diretiva break
			 *
			 */
			
		/**
		 * Uso da diretiva continue
		 */
		
			System.out.println("O programa foi executado ate o final");

	}

}
