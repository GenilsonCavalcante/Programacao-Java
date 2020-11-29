package aula48;

public class ManipulandoArrays {
	public static void main(String[] args) {
		
		int[] arrayInt = new int[10];
		arrayInt[0] = 10;
		arrayInt[1] = 20;
		arrayInt[2] = 30;
		arrayInt[9] = 100;
		
		//int soma = arrayInt[0] + arrayInt[1] + arrayInt[2];
		
		//System.out.println("A soma dos primeiros elementos é: " + soma);
		
		int soma = 0;
		for(int x = 0; x < 10; x++) {
			soma += arrayInt[x];
		}
		System.out.println("A soma dos primeiros elementos é: " + soma);
	}

}
