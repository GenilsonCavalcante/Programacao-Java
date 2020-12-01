package aula54;

public class ArraysMultidimensionais2 {
	public static void main(String[] args) {
		
		int[][] nums = new int[2][9];//Array de duas dimensões.
		nums[0][0] = 1;//Adicionado o valor 1000 a essa posição no Array.
		nums[0][1] = 2;
		nums[0][2] = 3;
		nums[0][3] = 4;
		nums[0][4] = 5;
		nums[0][5] = 6;
		nums[0][6] = 7;
		nums[0][7] = 8;
		nums[0][8] = 9;
		
//		System.out.println(nums[0][0]);
//		System.out.println(nums[1][0]);
		
//		System.out.println();
		
//		System.out.println(nums[0].length);//Para saber a quantidade de elementos dentro dessa dimensão especificada.
//		System.out.println();
//		System.out.println();
		//Vamos fazer agora para fazer printar todos os valores de nosso array:
		
		//Arrays multidimensionais, são arrays de arrays.
		
		for(int x = 0; x < nums[0].length; x++) {
			System.out.println(nums[0][x]);
		}
	}

}
