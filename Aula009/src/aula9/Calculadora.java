package aula9;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double num1, num2, soma, subtracao, div, mult;
		
		System.out.println("Digite um n�mero: ");
		num1 = in.nextDouble();
		
		System.out.println("Digite outro n�mero: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma desses dois n�meros �: " + soma);
		
		subtracao = num1 - num2;
		System.out.println("O resultado da subtra��o desses dois n�meros �: " + subtracao);
		
		div = num1 / num2;
		mult = num1 * num2;
		
		System.out.println("A multiplica��o dos dois n�meros �: " + mult);
		System.out.println("A divis�o dos dois n�meros �: " + div);
	}

}
