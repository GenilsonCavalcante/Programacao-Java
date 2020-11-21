package aula34;

import java.util.Random;

public class NumerosAleatorios {
	public static void main(String[] args) {
		
		//Para trabalhar com números aleatórios, usamos a classe Random. Veja:
		
		Random num = new Random();//Classe que sorteia números aleatórios.
		System.out.println(num.nextInt(6));//Sorteando um número de 0 até 5.
		
		System.out.println();
		
		System.out.println(num.nextInt(6)+1);//Sorteando um número de 1 até 6.

		System.out.println();
		
		System.out.println(num.nextInt());//Sorteia qualquer número inteiro(Positivo ou Negativo).
		
		System.out.println();

		for(int z = 0; z <= 10; z++) {
			System.out.println(num.nextInt(6));
			System.out.println(num.nextDouble()*11);//Gerando números decimais entre 0 á 10. Perceba que no Double, devemos multiplicar e não somar.
		//	System.out.println(num.nextDouble()*51+20);//Gerando números decimais aleatórios entre 10 e 50!!! ERRO!!!
			System.out.println(num.nextBoolean());//Números booleanos.
			System.out.println();
		}
		
	}

}
