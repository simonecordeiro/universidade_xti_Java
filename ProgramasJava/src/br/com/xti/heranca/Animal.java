package br.com.xti.heranca;

public class Animal {
	
	protected int serial;
	double peso;
	String comida;
	
	public Animal() {
		this(0, null);
	}
	
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
		
	}
	
	void dormir() {System.out.println("dormiu");}
	void fazerBarulho() {System.out.println("Fazer Barulho");}
	

}
