package aula10;

import java.util.Scanner;

public class TomadaDecisao1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um n�mero de 0 � 20: ");
		int num = in.nextInt();
		
		
		if(num == 10) {
			System.out.println("Este n�mero � igual � 10.");
		}else {
			System.out.println("Este n�mero N�O � igual � 10! e sim igual �: " + num);
		}
	}

}
