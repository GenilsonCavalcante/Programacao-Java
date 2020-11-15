package aula8;

import java.util.Scanner;

public class EntradaSaida {
	
	public static void main(String[] args) {
		
		/*
		 * 1 - Entrada de Dados
		 * 2 - Processamento de Dados
		 * 3 - Saída de Dados
		 */
		
		//Convertendo a idade de um cachorro para a de um humano.
		//CONDIÇÃO: Para cada 1 ano de vida do cachorro, corresponde a 7 anos de vida do humano.
		
		System.out.println("Digite a idade do seu cachorro: ");
		
		Scanner in = new Scanner(System.in);
		
		int idadeCachorro = in.nextInt();
		idadeCachorro = idadeCachorro * 7;
		
		System.out.println("O seu cachorro tem " + idadeCachorro + " anos.");
	}
}
