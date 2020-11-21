package aula27;

public class IteradorDoWhile1 {

	public static void main(String[] args) {
		//Laço de repetição DO/WHILE - FAÇA ENQUANTO...
		
		/*
		 * Diferente do WHILE, o DO é executado no mínimo uma vez, já que no WHILE, o bloco de comando é executada
		 * enquanto uma condição for verdadeira! O faça enquanto executa o 1° bloco de instrução e depois verifica a
		 * sentença falsa ou verdadeira, para apartir daí ir executando.
		 */
		
		int i = 0;
		
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
		
		System.out.println("===============================");
		
		System.out.println("De uma forma mais simplificada: ");
		
		int n = -1;
		
		do {
			System.out.println(++n);
		}while(n <= 9);
		
		//OBS: Sempre o DO/WHILE vai imprimir pelo menos uma vez!!!
		
	}

}
