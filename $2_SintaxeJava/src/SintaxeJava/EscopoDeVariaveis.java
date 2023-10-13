package SintaxeJava;

public class EscopoDeVariaveis {
	

	public static void main(String[] args) {


		/**
		 * O conjunto dos locais no qual uma declaraçao tem validade é denominado escopo.
		 * Um bloco de comandos é um conjunto de comandos da linguagem delimitados 
		 * por uma chave inicial { e outra chave final }.
		 * 
		 * A partir do ponto em que ocorreu a declaração de uma variável, é dito que
		 * a variável está em seu escopo, com visibilidade limitada ao bloco de comandos 
		 * onde ocorreu essa declaração, mas incluíndo escopos internos.
		 * 
		 * Assim, um escopo é como um espaço no qual existem um conjunto próprio de variáveis.
		 * 
		 */
		
		// Exemplo prático
		int i = 32;
		{
			int j = 23;
			System.out.println(i);
			{
				int z = 0;
				System.out.println(j);
			}
			//j = z; // z cannot be resolved to a variable
			//System.err.println(z);
		}

		//int x = i * j; // j cannot be resolved to a variable
		//System.err.println(x);
	}

}
