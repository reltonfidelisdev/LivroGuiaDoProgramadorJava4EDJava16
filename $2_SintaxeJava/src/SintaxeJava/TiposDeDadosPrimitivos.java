package SintaxeJava;

public class TiposDeDadosPrimitivos {

	public static void main(String[] args) {

		///
		// Inteiro: Bytes/bit Faixa de valores 
		// byte		1/8 		de -128 a +127 
		// short	2/19 		de -32.768 a +32.767 
		// int 		4/32 		de -2.147.483.648 a -2.147.483.647 
		// long 	8/64 		de ? até ? -> Pesquisa ai!
		int varInt = 0; // In 
		long varLong = 7961L; // L ou l

		//	Real: 
		//	float	4/32 		de IEEE 754 ±1,40129846432481707e-45 a 3,40282346638528860e+38 
		//	double	8/64 		de IEEE 754 ±4,94065645841246544e-324 a 1,79769313486231570e+308
		double	varDouble = 70.6754125;
		float	varFloat = 2.7F;
			
		// Caractere: char 2/16 de \u0000 a \uFFFF
		// 
		// Lógico: 
		//	boolean 1/8 		true e false
		//

		byte	varByte = 127;
		System.out.println(varByte);
		
		double	varShort = (short) 32.763;
		System.out.println(varDouble);
		
		// Para o tipo char, use sempre aspas simples
		char varChar = 'A';
		System.out.println(varChar);
		
		// O tipo boolean aceita true ou false
		boolean varBoolean = true; 
		System.out.println(varBoolean);
		
		// Para o tipo String, use sempre aspas duplas
		String varString = "String ou cadeia de caracteres";	
		System.out.println(varString);

		//String Modo comum
		String comum = "Um texo dividido em várias linhas,\n"
						+"mas COM caracteres especiais";
		System.out.println(comum);
		// String multi linha
		// As Strings multilinha usam três aspas duplas seguidas
		// como delimitador e o conteúdo da váriavel deve ficar contido nas linhas intermediárias.
		String multilinha = """
				Um texto vai aqui
				em várias linhas
				mas SEM usar caracteres espesciais
				""";
		System.out.println(multilinha);
		
		// Caracteres especiais
		//************************************************//
		//************************************************//
		//
		// \n	Pula linha			(new line ou linefeed)
		// \r	Retorno de carro 	(carriage return)
		// \b	Retrocesso			(backspace)
		// \t	Tabulação			(horizontal tabulation)
		// \f	Nova página 		(formfeed)
		// \'	Apóstrofe			(Aspas simples)
		// \"	Aspas				(Aspas duplas)
		// \`	Grave				(Acento grave)
		// \/	Barra
		// \\	Barra invertida
		//
		//************************************************//
		//************************************************//
	}

}
