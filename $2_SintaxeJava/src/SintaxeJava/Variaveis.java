package SintaxeJava;

public class Variaveis {

	public static void main(String[] args) {

		/**
		 * Uma variável é um nome definido pelo programador ao qual se associa um valor
		 * que pertence a um tipo de dados particular, armazenados em um conjunto de
		 * posições da memória do computador. O nome, ou identificador de variável, deve
		 * descrever seu propósito e serve como representação simbólica do local da memória
		 * onde se encontra o seu valor, evitando que o programador conheça tais detalhes.
		 * Assim, toda variável possue um nome, um tipo e um valor (seu conteúdo).
		 * 
		 *  O nome de uma varável, em Java, é formado por uma sequência de um ou mais 
		 *  caracteres alfabéticos e numéricos iniciados por uma letra ou pelos caracteres 
		 *  _ (undescore) ou $ (cifrão). Nomes não podem conter símbolos gráficos, operadores
		 *  ou espaços em branco, podendo ser arbitráriamente longos, embora apenas
		 *  os primerios 32 caracteres sejam usados para distingui-los.
		 *  
		 *  Segundo a regra de formação apresentada, os nomes das variáveis a seguir são
		 *  são considerados inválidos.
		 */

//		int 1X = 12;
//		long Total Geral = 125e9;
//		short numero-Minimo = 0.01;
//		int void = 0;
//		String super = "UP!";
		
		/**
		 * Enquanto o que se segue é aceito pelo Java
		 */
		char a = 'a';
		System.out.println(a);
		int total = Integer.MAX_VALUE;
		System.out.println(total);
		String X2 = null;
		System.out.println(X2);
		int $dolar = Integer.SIZE;
		System.out.println($dolar);
		Object _special = new Object().hashCode();
		System.out.println(_special);
		
		
	}

}
