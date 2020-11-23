package aula44;

public class ArrayUnidimensional {
	public static void main(String[] args) {
		
		/*
		 * Estrutura recomendada(Oficial):
		 * 
		 * <tipo>[] <nome>;
		 */
		
		/*
		 * Array � uma estrutura de dados que permite a manipula��o
		 * de um n�mero finito de elementos de um mesmo tipo.
		 * No java, Array � uma cole��o ordenada de elementos.
		 */
		
		int[] array;//Declara��o do nosso array.
		array = new int[10]; //Cria e reserva o espa�o de 10 elementos para o nosso array
		
		for(int i = 0; i <= 9; i++) {
			System.out.printf("%5d%7d\n", i, array[i]);
		}
	}

}
