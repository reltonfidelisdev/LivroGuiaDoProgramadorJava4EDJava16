package SintaxeJava;

public class OperadoresAtribuicaoComposta {

	public static void main(String[] args) {

		/**
		 * Durante a programação é muito comum a ocorrência de expressões como:
		 * 
		 * 	x = x + 15;
		 * 	y = y - posAbsoluta;
		 * 	total = * (valor/referancia);
		 * 
		 * Em todas é identificada uma estrutura como: a variavel que recebe o resultado
		 * da atribuição, declarada previamente, figura como primeiro termo da expressão
		 * que produz seu valor, indicando opreações de totalização ou acumulação.
		 * 
		 * Operadores de atribuição composta:
		 * 
		 * Operador	Significado				Associatividade		Exemplo
		 * 	+= Adição e atribuição			Direita				a += b
		 * 	-= Subitração e atribuição		Direita				a -+ b
		 * 	*= Multiplicação e atribuição	Direita				a *= b
		 * 	/= Divisão e atribuição			Direita				a /= b
		 * 	%= Divisão inteira e atribuição	Direita				a %= b
		 * 	&= E bitwise e atrribuição		Direita				a &= b
		 * 	|= Ou bitwise e atribuição		Direita				a |= b
		 * 	^= Ou-exclusivo bitwise e atr.	Direita				a ^= b
		 * 	>>= Rotação à direita e atr.	Direita				a >>= b
		 * 	<<= Rotação à esquerda e atr.	Direita				a <<= b
		 * 	>>>	Rotação à direita sem sinal e atr.	Direita		a >>> b 
		 * 	
		 */
		
		String textoAdicaoAtribuicao = "{\n";
		textoAdicaoAtribuicao += "\t\"json\": \"true\"";
		textoAdicaoAtribuicao += "\n}";
		System.out.println(textoAdicaoAtribuicao);
		
		
		

	}

}
