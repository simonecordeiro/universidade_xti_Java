package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	
	public static void dividir(Scanner s) throws InputMismatchException {
		
		
		System.out.println("Numero: ");
		int a = s.nextInt();
		System.out.println("Divisor: ");
		int b = s.nextInt();
		
		System.out.println(a / b);
		
	}


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			
			try {
				dividir(s);
				continua = false;
			}	
			
			    catch(InputMismatchException | ArithmeticException e1) {
				System.out.println("Numeros Invalido");
				e1.getMessage();
				s.nextLine();//descarta a entrada errada e libera novamente para o usuário.
			}
				
			finally {
				System.out.println("Finally Executado");
			}
			
		} while (continua);
	 
	}
}
