package SintaxeJava;

public class PrecedenciaAvaliacaoOperadores {

	public static void main(String[] args) {

		/**
		 * Expressões podem usar operadores diferentes, por isso é necessário um critério para
		 * determinar qual desses operadores será processado primeiron assim como ocorre
		 * em expressões matemáticas comuns.
		 * 
		 * O conceito de precendência (ou prioridade) representa esse critério, ordem ou a
		 * hierarquia de avaliação dos operadores.
		 * 
		 * As regras de precedência convencionadas pela linguagem são aplicadas em todas
		 * as expressões, garantindo que reproduzam sempre o mesmo resultado, qualquer que seja a
		 * combinação dos operadores, o compilador ou a plataforma utilizada.
		 * 
		 * A tabela a baixo mostra a precedência do Java organizada em níveis do primeiro (nível 1)
		 * para o último (nível 16).
		 * 
		 * Operadores em um mesmo nível de precedência são avaliados conforme a ordem em que são encontrados,
		 * da esquerda para a direita.
		 * 
		 * Os parênteses "()" são operadores que podem ser usados para alterar a precedência natural, determinando
		 * uma forma expessífica de avaliação de uma expressão, pois primeiro são avaliadas as operações contidas
		 * nos parênteses mais internos antes de se proceder com o restante da avaliação da expressão.
		 * 
		 * Precedência dos operadores em Java:
		 * 
		 * 	Nível	Operadores
		 * 	1		[] () .(seletor)
		 * 	2		++ ~ instanceof new -(unário) (cast)
		 * 	3		* / %
		 * 	4		+ -	
		 * 	5		<< >> >>>
		 * 	6		<> <= >=
		 * 	7		== !=
		 * 	8		&
		 * 	9		~
		 * 	10		|
		 * 	11		&&
		 * 	12		||
		 * 	13		?:
		 * 	14		= op=
		 * 	15		,
		 * 	16		-> (operador lambda)
		 * 
		 * As palavras reservadas instanceof e new comportam-se como operadores. 
		 */
		
		

	}

}
