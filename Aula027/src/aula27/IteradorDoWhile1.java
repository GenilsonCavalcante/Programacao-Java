package aula27;

public class IteradorDoWhile1 {

	public static void main(String[] args) {
		//La�o de repeti��o DO/WHILE - FA�A ENQUANTO...
		
		/*
		 * Diferente do WHILE, o DO � executado no m�nimo uma vez, j� que no WHILE, o bloco de comando � executada
		 * enquanto uma condi��o for verdadeira! O fa�a enquanto executa o 1� bloco de instru��o e depois verifica a
		 * senten�a falsa ou verdadeira, para apartir da� ir executando.
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
