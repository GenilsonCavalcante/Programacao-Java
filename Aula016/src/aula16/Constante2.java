package aula16;

/**
 * @author Genilson
 *
 */

import java.util.Scanner;

public class Constante2 {
	public static void main(String[] args) {
		
		//Calcular a distância que o som vai percorrer em um espaço de tempo.
		
		final double velocSom = 340.28; // m/s
		
		System.out.println("Digite o espaço de tempo: ");
		Scanner in = new Scanner(System.in);
		
		int tempo = in.nextInt();
		
		System.out.println("A distância seria de: " + tempo * velocSom + " metros pecorridos");
		System.out.println("A distância pecorrida em km é: " + (tempo * velocSom) / 1000 + " km pecorridos");

	}

}
