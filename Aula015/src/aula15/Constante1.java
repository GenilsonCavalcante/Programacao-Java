package aula15;

public class Constante1 {
	public static void main(String[] args) {
		
		//Constante � algo que n�o varia, n�o muda, permanece
		/*
		 * Caracter�sticas:
		 * 
		 * 1 - Os dados nunca ser�o alterados
		 * 2 - Uma constante tem o seu endere�o de mem�ria protegido
		 * 3 - Uma constante nunca ser� desalocada
		 * 4 - Declaramos uma vez, utilizamos quantas vezes for preiso
		 */
		
		//EXEMPLOS:
		
		int var = 10; //Este � um exemplo de uma VARI�VEL;
		final int constante = 11; //Este � um exemplo de uma CONSTANTE.
		
		//O que vai determinar ser um valor constante � o uso do nome "final" logo no in�cio da declara��o.
		
		//Ap�s declarada uma vez, uma constante n�o pode mais ser declarada aceitando outro valor. Pois o valor definido inicialmente n�o altera
		
		System.out.println(var);
		System.out.println(constante);
	}

}
