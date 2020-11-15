package aula17;

/**
 * @author Genilson
 *
 */

import java.util.Scanner;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		//Determinar a classificação de idade para as pessoas.
		//Jovem: até 17 anos
		//Idade média: mais de 17 e menos de 60
		//Idoso: apartir de 60.
		
		final int idadeJ, idadeI;
		idadeJ = 17;
		idadeI = 60;

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int valorIdade = in.nextInt();
		
		if(valorIdade <= 17) {
			System.out.println("Você é um Jovem!!!");
		}else {
			if(valorIdade > 17 && valorIdade < 60) {
				System.out.println("Idade média!!!");
			}else {
				if(valorIdade >= 60) {
					System.out.println("Você é um Idoso(a)!!!");
				}
			}
		}
	}

}
