package aula47;

public class CaracteristicasDosArrays {
	public static void main(String[] args) {
		
		//CARACTAR�STICAS DOS ARRAYS:
		
		/*
		 * DIMENS�O: Array � tido como um objeto em Java, e dentro de
		 * um Array, vai possuir v�rios elementos, sendo esses a dimens�o 
		 * desse array.
		 * 
		 * �NDICE: cada elemento em um array possui sua posi��o no mesmo, logo
		 * para cada elemento, vai possuir um �ndice que o represente, sendo que
		 * todos os �ndices na programa��o se inicia com 0.
		 * 
		 * ELEMENTOS: Os elementos s�o os conte�dos que ficam contidos em um Array,
		 * sendo que cada elemento em um array � acessado pelo seu respectico �ndice.
		 * 
		 * TIPO: Todos os elementos de um array possuem um tipo, ou seja, uma vez definido
		 * o tipo de um arry logo em sua declara��o, todos os elementos corresponder�o ap tipo
		 * declarado.
		 */
		
		//Ex:
		
		int[] a = new int[10]; //int[10] -- Significa dizer que o array possui 10 posi��es.
		
		
		a[0] = 0;
		a[1] = 111;
		a[2] = 222;
		a[3] = 333;
		a[4] = 444;
		a[5] = 1000; //na quita posi��o o array a[] receber� o valor 1000;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
	}

}
