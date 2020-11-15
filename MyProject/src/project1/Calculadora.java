package project1;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		System.out.println("===========================================");
		System.out.println("CALCULADORA");
		System.out.println("===========================================");
		System.out.println(" ");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 á 10: ");
		for(int x = in.nextInt(); x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				System.out.println(x + " * " + y + " = " + x*y);
			}
			System.out.println(" ");
			System.out.println("===========================================");
			System.out.println(" ");
		}

	}

}
