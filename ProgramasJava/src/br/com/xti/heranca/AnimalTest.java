package br.com.xti.heranca;

public class AnimalTest {
	
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}

	public static void barulhoSemPolimorfismo(String animal) {
		if(animal.equals("Cachoroo")) {
			System.out.println("Au, Au !");
		}else if (animal.equals("Galinha")) {
			System.out.println("Có, Có !");
		
		}
	}
	public static void main(String[] args) {
		
		
		Animal toto = new Cachorro();
		Animal carijo = new Galinha();
		
		barulho(toto);
		barulho(carijo);
		
		barulhoSemPolimorfismo("Cachorro");
		barulhoSemPolimorfismo("Galinha");
		
	}

}
