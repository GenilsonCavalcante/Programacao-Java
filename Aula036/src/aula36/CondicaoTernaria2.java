package aula36;

import java.util.Scanner;

public class CondicaoTernaria2 {
	public static void main(String[] args) {
		

//		System.out.println("QUAL � O SEU DIA PREDILETO?");
//		System.out.println("DIGITE (1) PARA SEGUNDA OU (7) PARA DOMINGO:");
//		int valor = in.nextInt();
//		//System.out.println(valor);
//		String dia = (valor == 1) ? "SEGUNDA" : "DOMINGO";
//		System.out.println(dia);
		
		//OBS: O simbolo (?) refere-se ao c�digo SE e o s�mbolo (:) refere-se ao c�digo SENAO!
		
		//ou

		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println("QUAL � O SEU DIA PREDILETO?");
		System.out.println("DIGITE (1) PARA SEGUNDA OU (7) PARA DOMINGO:");
		int num = in.nextInt();
		String dia = (num == 1) ? "SEGUNDA" : (num == 2) ? "TER�A" : (num == 3) ? "QUARTA" : (num == 4) ? "QUINTA" : (num == 5) ? "SEXTA" : (num == 6) ? "S�BADO" : (num == 7) ? "DOMINGO" : "DIA-INV�LIDO";
	
		System.out.println("O seu sia favorito �: " + "===" + dia + "===");
		
		//Para esse tipo de situa��o acima, o melhor a se utilizar o (SWITCH). VEJA:(ESTUDAR O SWITCH!!!!!!!!!!!!!!!!!!!!)
		
//		switch (num) {
//			case 1 : dia = "segunda"; //case = caso;
//			case 2 : dia = "ter�a";
//			case 3 : dia = "quarta";
//			case 4 : dia = "quinta";
//			case 5 : dia = "sexta";
//			case 6 : dia = "s�bado";
//			case 7 : dia = "domingo";
//			default: dia = "Dia inv�lido";
//		}
//		System.out.println(dia);
	}

}
