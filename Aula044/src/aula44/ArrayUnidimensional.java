package aula44;

public class ArrayUnidimensional {
	public static void main(String[] args) {
		
		/*
		 * Estrutura recomendada(Oficial):
		 * 
		 * <tipo>[] <nome>;
		 */
		
		/*
		 * Array é uma estrutura de dados que permite a manipulação
		 * de um número finito de elementos de um mesmo tipo.
		 * No java, Array é uma coleção ordenada de elementos.
		 */
		
		int[] array;//Declaração do nosso array.
		array = new int[10]; //Cria e reserva o espaço de 10 elementos para o nosso array
		
		for(int i = 0; i <= 9; i++) {
			System.out.printf("%5d%7d\n", i, array[i]);
		}
	}

}
