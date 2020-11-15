package aula13;

import java.util.Scanner;

public class Calculadora2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x;
		double num1, num2, resultado;
		
		System.out.println("===============================================");
		System.out.println("***CALCULADORA***");
		System.out.println("===============================================");
		System.out.println(" ");
		
		System.out.println("Digite 1 para somar");
		System.out.println("Digite 2 para subtrair");
		System.out.println("Digite 3 para multiplicar");
		System.out.println("Digite 4 para dividir");
		
		System.out.println("Qual operação deseja fazer? ");
		x = in.nextInt();
		
		System.out.println("Digite o primeito número para calcular: ");
		num1 = in.nextDouble();
		
		System.out.println("Digite o segundo número para calcular: ");		
		num2 = in.nextDouble();
		
		if(x == 1) {
			resultado = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + resultado);
		}else {
			if(x == 2) {
				resultado = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + resultado);
			}else {
				if(x == 3) {
					resultado = num1 * num2;
					System.out.println(num1 + " * " + num2 + " = " + resultado);
				}else {
					if(x == 4) {
						resultado = num1 / num2;
						System.out.println(num1 + " / " + num2 + " = " + resultado);
					}else {
						System.out.println("Você digitou um valor inválido!!!");
					}
				}
			}
		}
	}
}
