package br.com.xti.erros;

import br.com.xti.heranca.Animal;

public class ExcecoesComuns {
	
	static int[] arrayNull = new int[0];

	public static void main(String[] args) {
		
		//NullPointerException
		//System.out.println(arrayNull.length);
		
		//InputMismatchException
		//int x = 5 / 0;
		
		//ArrayIndexOutOfBoundsException
		//System.out.println(arrayNull[1]);
		
		//ClassCastException
		//Animal a = new Galinha();
		//Cachorro c = (Cachorro) a;
		
		//NumberFormatException
		//int i = Integer.parseInt("X");
		

	}

}
