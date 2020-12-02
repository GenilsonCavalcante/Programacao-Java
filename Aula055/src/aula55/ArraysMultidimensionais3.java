package aula55;

public class ArraysMultidimensionais3 {

	public static void main(String[] args) {
		
		int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};//Declarando um array multidimensional e atribuindo os seus elementos
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 0; y++) {
				System.out.print(nums[x][y]+" ");
				System.out.println();
			}
		}

	}

}
