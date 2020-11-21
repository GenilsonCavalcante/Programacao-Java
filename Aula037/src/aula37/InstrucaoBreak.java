package aula37;

import java.util.Scanner;

public class InstrucaoBreak {
	public static void main(String[] args) {
		
		/*
		 * A instru��o BREAK � utilizada dentro de um looping no momento em que desejamos
		 * encerrar o mesmo. Ou seja, n�o precisamos esperar a condi��o ser finalizada, 
		 * podemos interromper o la�o a qualquer momento.
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Dite um n�mero entre 0 e 50:");
		int digite = in.nextInt();
		
		for(int x = 0; x <= 50;) {
			if(x == digite) {
				break;//Para o looping nessa condi��o!
			}else {
				if(digite > 50 || digite < 0) {
					System.out.println("Voc� digitou um n�mero inv�lido!!!");
					break;
				}
			}
			x++;
			System.out.println(x);
		}
	}

}
