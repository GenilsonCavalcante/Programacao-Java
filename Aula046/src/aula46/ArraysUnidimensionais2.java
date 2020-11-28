package aula46;

public class ArraysUnidimensionais2 {
	public static void main(String[] args) {
		
		//Arrays Unidimensionais
		
		/*
		 * Array de uma única dimensão é excelente em situações onde precisamos
		 * manipular uma grande quantidade de elementos de maneira uniforme. Sendo
		 * um Array uma lista de variáceis indexadas, temos assim, a estrutura ideal 
		 * para este fim.
		 * 
		 * EXEMPLO:
		 * 
		 * int[] meuArray = {1, 2, 3, 4, 5};
		 * 
		 * OBS: Apartir de que você cria um Array na memória do computador, esse
		 * será considerado inalterado, estático, não podendo mais ser alterado, a
		 * não ser se você crie uma estácia.
		 */
		
		int[] array = {78, 20, 56, 89, 1};
		System.out.printf("%5d%8d\n", "Indice", "Valores");//printf --- Print Formatado
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d\n", i, array[i]);
		}
		
	}

}
