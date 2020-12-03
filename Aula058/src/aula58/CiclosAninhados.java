package aula58;

public class CiclosAninhados {
	public static void main(String[] args) {
		
		System.out.println("Apenas com uma dimensão");
		System.out.println();
		
		int[] valores = new int[5];
		for(int i = 0; i < 5; i++) {
			valores[i] = i;
			System.out.println("No "+(i+1)+"° ciclo, o valor de i = "+ i);
		}
		
		System.out.println();
		System.out.println("Apenas com duas dimensões");
		System.out.println();
		
		int[][] valores2 = new int[5][5];
		for(int x = 0; x < 5; x++) {
			for(int y = 0; y < 5; y++) {
				valores2[x][y] = 9;
				System.out.println(valores2[x][y]);
			}
		}
	}

}
