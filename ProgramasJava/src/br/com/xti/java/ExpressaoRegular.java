package br.com.xti.java;

import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		boolean b = "Java".matches("Java");
		
		//*MODIFICADORES
		//(?I), ignora mai�scula e min�scula
		//(?x), coment�rios
		//(?m), multilinhas
		//(?s), dottal*//
		
		//b = "Java" .matches("(?i)java");
		//System.out.println(b);
		
		//*METACARACTER DE FRONTEIRA
		// ^ inicia
		// $ finaliza 
		// ou  */
		
		b = "Pier21" .matches("^Pier.*");
		b = "Pier21" .matches(".*21$");
		b = "tem java aqui" .matches(".*java.*");
		b = "tem java aqui" .matches("^tem.*aqui$");
		
		//AGRUPADORES
		// [...]           Agrupamento
		// [a-z]           Alcance
		// [a-e][i-u]      Uni�o
		// [a-z&&[aeioui]] Interse��o
		// [^abc]          Exce��o
		// [a-z&&[~m-p]]   Subtra��o
		// \x              Fuga literal
		
		b = "x" .matches("[a-z]");
		b = "3" .matches("[0-9]");
		
		b = "True" .matches("[tT]rue");	// true True	
		b = "True" .matches("[tT]rue|[yY]es");	// true True yes Yes
		b = "Rafael" .matches("[A-Z][a-zA-Z]*"); // Primeiro nome letra mai�scula	
		b = "rh@xti.com.br".matches("\\w+@\\w+\\.\\w{2,3}");//valida��o de email
		
		String doce = "Qual � o Doce mais doCe que o doce";
		Pattern.compile("(?i)doce, 0");
		
		System.out.println(b);
		
	}

}
