package aula15;

public class Constante1 {
	public static void main(String[] args) {
		
		//Constante é algo que não varia, não muda, permanece
		/*
		 * Características:
		 * 
		 * 1 - Os dados nunca serão alterados
		 * 2 - Uma constante tem o seu endereço de memória protegido
		 * 3 - Uma constante nunca será desalocada
		 * 4 - Declaramos uma vez, utilizamos quantas vezes for preiso
		 */
		
		//EXEMPLOS:
		
		int var = 10; //Este é um exemplo de uma VARIÁVEL;
		final int constante = 11; //Este é um exemplo de uma CONSTANTE.
		
		//O que vai determinar ser um valor constante é o uso do nome "final" logo no início da declaração.
		
		//Após declarada uma vez, uma constante não pode mais ser declarada aceitando outro valor. Pois o valor definido inicialmente não altera
		
		System.out.println(var);
		System.out.println(constante);
	}

}
