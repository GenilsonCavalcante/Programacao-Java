package aula16;

/**
 * @author Genilson
 *
 */

import java.util.Scanner;

public class Constante2 {
	public static void main(String[] args) {
		
		//Calcular a dist�ncia que o som vai percorrer em um espa�o de tempo.
		
		final double velocSom = 340.28; // m/s
		
		System.out.println("Digite o espa�o de tempo: ");
		Scanner in = new Scanner(System.in);
		
		int tempo = in.nextInt();
		
		System.out.println("A dist�ncia seria de: " + tempo * velocSom + " metros pecorridos");
		System.out.println("A dist�ncia pecorrida em km �: " + (tempo * velocSom) / 1000 + " km pecorridos");

	}

}
