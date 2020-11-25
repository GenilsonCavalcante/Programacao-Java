package revaula37;

import java.util.Scanner;

public class RevIntroducaoBreak {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite qualquer número inteiro:");
		int num = in.nextInt();
		
		for(int x = 0; x <= num;x++) {
			System.out.println("N° "+x);
			if(x == num) {
				break;
			}
		}
	}
}
