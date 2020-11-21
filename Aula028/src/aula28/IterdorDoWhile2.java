package aula28;

import java.util.Scanner;

public class IterdorDoWhile2 {
	public static void main(String[] args) {
		
		//Versão 03 da Calculadora - Utilizando o DO/WHILE.
		
		Scanner in = new Scanner(System.in);
		
		int x = 0;
		double num1, num2, resultado;
		
		do {
		
			System.out.println("==============================");
			System.out.println();
			System.out.println("DIGITE O CÓDIGO PARA REALIZAR TAL OPERAÇÃO:");
			System.out.println("[1] PARA ADICIONAR");
			System.out.println("[2] PARA SUBTRAIR");
			System.out.println("[3] PARA MULTIPLICAR");
			System.out.println("[4] PARA DIVIDIR");
			System.out.println("[0] PARA SAIR");
			System.out.println();
			System.out.println("==============================");
			System.out.println();
			System.out.println();
			
			System.out.println("INFORME O NÚMERO DESEJADO: ");
			x = in.nextInt();
			
			if(x != 0 && x == 1 || x == 2 || x == 3 || x == 4) {//Verifica se o usuário deseja sair, se caso não, continua...
				System.out.println("DIGITE O 1° NÚMERO");
				num1 = in.nextDouble();
				
				System.out.println("DIGITE O 2° NÚMERO");
				num2 = in.nextDouble();
				
				if(x == 1) {
					resultado = num1 + num2;
					System.out.println(num1 + " + " + num2 + " = " + resultado);
					System.out.println("==============================");
					System.out.println();
				}else {
					if(x == 2) {
						resultado = num1 - num2;
						System.out.println(num1 + " - " + num2 + " = " + resultado);
						System.out.println("==============================");
						System.out.println();
					}else {
						if(x == 3) {
							resultado = num1 * num2;
							System.out.println(num1 + " * " + num2 + " = " + resultado);
							System.out.println("==============================");
							System.out.println();
						}else {
							if(x == 4) {
								resultado = num1 / num2;
								System.out.println(num1 + " / " + num2 + " = " + resultado);
								System.out.println("==============================");
								System.out.println();
							}
						}
					}
				}
			}
		}while(x!=0 && x == 1 || x == 2 || x == 3 || x == 4);
	
	}

}
