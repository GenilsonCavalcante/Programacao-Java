package aula47;

public class CaracteristicasDosArrays {
	public static void main(String[] args) {
		
		//CARACTARÍSTICAS DOS ARRAYS:
		
		/*
		 * DIMENSÃO: Array é tido como um objeto em Java, e dentro de
		 * um Array, vai possuir vários elementos, sendo esses a dimensão 
		 * desse array.
		 * 
		 * ÍNDICE: cada elemento em um array possui sua posição no mesmo, logo
		 * para cada elemento, vai possuir um índice que o represente, sendo que
		 * todos os índices na programação se inicia com 0.
		 * 
		 * ELEMENTOS: Os elementos são os conteúdos que ficam contidos em um Array,
		 * sendo que cada elemento em um array é acessado pelo seu respectico índice.
		 * 
		 * TIPO: Todos os elementos de um array possuem um tipo, ou seja, uma vez definido
		 * o tipo de um arry logo em sua declaração, todos os elementos corresponderão ap tipo
		 * declarado.
		 */
		
		//Ex:
		
		int[] a = new int[10]; //int[10] -- Significa dizer que o array possui 10 posições.
		
		
		a[0] = 0;
		a[1] = 111;
		a[2] = 222;
		a[3] = 333;
		a[4] = 444;
		a[5] = 1000; //na quita posição o array a[] receberá o valor 1000;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
	}

}
