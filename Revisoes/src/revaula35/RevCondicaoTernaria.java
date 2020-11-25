package revaula35;

import java.util.Scanner;

public class RevCondicaoTernaria {
	public static void main(String[] args) {
		
		//Revisão da aula035 - Condição Ternária 1
		
		/*
		 * Com a condição ternária, podemos fazer o if e o else em apenas uma linha de código
		 */
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Digite um número inteiro: ");
//		int n = in.nextInt();
//		String verificacao = (n%2==0) ? "Número PAR" : "Número IMPAR";
//		System.out.println(verificacao);
		
		for(int i = 0; i <= 100; i++) {
			String verificacao = (i%2==0) ? i + " É um Número PAR" : i + " É um Número IMPAR";
			System.out.println(verificacao);
		}
		
		
	}

}
