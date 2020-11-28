package aula46;

public class ArraysUnidimensionais2 {
	public static void main(String[] args) {
		
		//Arrays Unidimensionais
		
		/*
		 * Array de uma �nica dimens�o � excelente em situa��es onde precisamos
		 * manipular uma grande quantidade de elementos de maneira uniforme. Sendo
		 * um Array uma lista de vari�ceis indexadas, temos assim, a estrutura ideal 
		 * para este fim.
		 * 
		 * EXEMPLO:
		 * 
		 * int[] meuArray = {1, 2, 3, 4, 5};
		 * 
		 * OBS: Apartir de que voc� cria um Array na mem�ria do computador, esse
		 * ser� considerado inalterado, est�tico, n�o podendo mais ser alterado, a
		 * n�o ser se voc� crie uma est�cia.
		 */
		
		int[] array = {78, 20, 56, 89, 1};
		System.out.printf("%5d%8d\n", "Indice", "Valores");//printf --- Print Formatado
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d\n", i, array[i]);
		}
		
	}

}
