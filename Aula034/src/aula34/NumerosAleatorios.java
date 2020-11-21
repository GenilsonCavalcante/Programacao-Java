package aula34;

import java.util.Random;

public class NumerosAleatorios {
	public static void main(String[] args) {
		
		//Para trabalhar com n�meros aleat�rios, usamos a classe Random. Veja:
		
		Random num = new Random();//Classe que sorteia n�meros aleat�rios.
		System.out.println(num.nextInt(6));//Sorteando um n�mero de 0 at� 5.
		
		System.out.println();
		
		System.out.println(num.nextInt(6)+1);//Sorteando um n�mero de 1 at� 6.

		System.out.println();
		
		System.out.println(num.nextInt());//Sorteia qualquer n�mero inteiro(Positivo ou Negativo).
		
		System.out.println();

		for(int z = 0; z <= 10; z++) {
			System.out.println(num.nextInt(6));
			System.out.println(num.nextDouble()*11);//Gerando n�meros decimais entre 0 � 10. Perceba que no Double, devemos multiplicar e n�o somar.
		//	System.out.println(num.nextDouble()*51+20);//Gerando n�meros decimais aleat�rios entre 10 e 50!!! ERRO!!!
			System.out.println(num.nextBoolean());//N�meros booleanos.
			System.out.println();
		}
		
	}

}
