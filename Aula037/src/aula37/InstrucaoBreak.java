package aula37;

import java.util.Scanner;

public class InstrucaoBreak {
	public static void main(String[] args) {
		
		/*
		 * A instrução BREAK é utilizada dentro de um looping no momento em que desejamos
		 * encerrar o mesmo. Ou seja, não precisamos esperar a condição ser finalizada, 
		 * podemos interromper o laço a qualquer momento.
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Dite um número entre 0 e 50:");
		int digite = in.nextInt();
		
		for(int x = 0; x <= 50;) {
			if(x == digite) {
				break;//Para o looping nessa condição!
			}else {
				if(digite > 50 || digite < 0) {
					System.out.println("Você digitou um número inválido!!!");
					break;
				}
			}
			x++;
			System.out.println(x);
		}
	}

}
