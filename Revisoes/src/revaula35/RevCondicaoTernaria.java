package revaula35;

import java.util.Scanner;

public class RevCondicaoTernaria {
	public static void main(String[] args) {
		
		//Revis�o da aula035 - Condi��o Tern�ria 1
		
		/*
		 * Com a condi��o tern�ria, podemos fazer o if e o else em apenas uma linha de c�digo
		 */
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Digite um n�mero inteiro: ");
//		int n = in.nextInt();
//		String verificacao = (n%2==0) ? "N�mero PAR" : "N�mero IMPAR";
//		System.out.println(verificacao);
		
		for(int i = 0; i <= 100; i++) {
			String verificacao = (i%2==0) ? i + " � um N�mero PAR" : i + " � um N�mero IMPAR";
			System.out.println(verificacao);
		}
		
		
	}

}
