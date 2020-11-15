package aula10;

import java.util.Scanner;

public class TomadaDecisao1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número de 0 á 20: ");
		int num = in.nextInt();
		
		
		if(num == 10) {
			System.out.println("Este número é igual á 10.");
		}else {
			System.out.println("Este número NÃO é igual á 10! e sim igual á: " + num);
		}
	}

}
