package aula9;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double num1, num2, soma, subtracao, div, mult;
		
		System.out.println("Digite um número: ");
		num1 = in.nextDouble();
		
		System.out.println("Digite outro número: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma desses dois números é: " + soma);
		
		subtracao = num1 - num2;
		System.out.println("O resultado da subtração desses dois números é: " + subtracao);
		
		div = num1 / num2;
		mult = num1 * num2;
		
		System.out.println("A multiplicação dos dois números é: " + mult);
		System.out.println("A divisão dos dois números é: " + div);
	}

}
