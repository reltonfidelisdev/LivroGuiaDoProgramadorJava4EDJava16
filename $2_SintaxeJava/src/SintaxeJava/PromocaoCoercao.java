package SintaxeJava;

public class PromocaoCoercao {

	public static void main(String[] args) {

		/**
		 * Quando valores de tipos primitivos diferentes são misturados numa expressão,
		 * os tipos mais simples são transformados nos tipos mais complexos envolvidos
		 * por meio da promoção automática de tipos.
		 * 
		 * Segue um trecho que explica a promoção automática de tipos.
		 * 
		 */
		
		short 	s = 3;
		System.out.println("O tipo de s é: " + ((Object)s).getClass().getName());
		System.out.println(s);
		
		int 	i = s * 5;	//	i é promovido a int
		System.out.println("O tipo de i é: " + ((Object)i).getClass().getName());
		System.out.println(i);
		
		long 	l = 23 + i;	//	literal l e i são promovidos para long
		System.out.println("O tipo de l é: " + ((Object)l).getClass().getName());
		System.out.println(l);
		
		float 	f = 1.5f;
		System.out.println("O tipo de f é: " + ((Object)f).getClass().getName());
		System.out.println(f);
		
		double 	d = 2.5 + f;//	f é promovido para double
		System.out.println("O tipo de d é :" + ((Object)d).getClass().getName());
		System.out.println(d);

		var 	t = l / d;	//	d é promovido para double, do tipo 4.0
		System.out.println("O tipo de t é: " + ((Object)d).getClass().getName());
		System.out.println(t);
		
	}

}
