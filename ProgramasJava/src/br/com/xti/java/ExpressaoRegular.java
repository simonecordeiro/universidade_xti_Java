package br.com.xti.java;

import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		boolean b = "Java".matches("Java");
		
		//*MODIFICADORES
		//(?I), ignora maiúscula e minúscula
		//(?x), comentários
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
		// [a-e][i-u]      União
		// [a-z&&[aeioui]] Interseção
		// [^abc]          Exceção
		// [a-z&&[~m-p]]   Subtração
		// \x              Fuga literal
		
		b = "x" .matches("[a-z]");
		b = "3" .matches("[0-9]");
		
		b = "True" .matches("[tT]rue");	// true True	
		b = "True" .matches("[tT]rue|[yY]es");	// true True yes Yes
		b = "Rafael" .matches("[A-Z][a-zA-Z]*"); // Primeiro nome letra maiúscula	
		b = "rh@xti.com.br".matches("\\w+@\\w+\\.\\w{2,3}");//validação de email
		
		String doce = "Qual é o Doce mais doCe que o doce";
		Pattern.compile("(?i)doce, 0");
		
		System.out.println(b);
		
	}

}
