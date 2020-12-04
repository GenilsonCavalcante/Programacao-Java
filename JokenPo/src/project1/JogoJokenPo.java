package project1;

import java.util.Random;
import java.util.Scanner;

public class JogoJokenPo {
	public static void main(String[] args) {
		
		//###M�quina###
		Random sorteio = new Random();
		int sorteio1 = sorteio.nextInt(3)+1;
		//System.out.println(escolha1);//Resultado da m�quina.
		
		System.out.println();
		System.out.println("==================Jogo-JoKenPo==================");
		System.out.println();
		
		String escolha1;
		switch (sorteio1) {
		case 1 : escolha1 = "PEDRA";break;
		case 2 : escolha1 = "PAPEL";break;
		case 3 : escolha1 = "TESOURA";break;
		default : escolha1 = "N�MERO INV�LIDO";break;
		}
		
		//###Humano###
		Scanner in = new Scanner(System.in);
		System.out.println("=========== ESCOLHA UM N�MERO ABAIXO ===========");
		System.out.println("1 - PEDRA");
		System.out.println("2 - PAPEL");
		System.out.println("3 - TESOURA");
		System.out.println("QUAL ESCOLHE . . .");
		int sorteio2 = in.nextInt();
		
		String escolha2;
		switch (sorteio2) {
		case 1 : escolha2 = "PEDRA";break;
		case 2 : escolha2 = "PAPEL";break;
		case 3 : escolha2 = "TESOURA";break;
		default : escolha2 = "N�MERO INV�LIDO";break;
		}
		
		System.out.println("A m�quina escolheu: "+escolha1);//Resultado da m�quina.
		System.out.println("Voc� escolheu: "+escolha2);//Resultado do usu�rio.
		
		String ganhador =   (escolha1 == escolha2) ? "EMPATE" : 
							(escolha1 == "PAPEL"   && escolha2 == "TESOURA")  ? "JOGADOR-GANHOU" :
							(escolha1 == "PAPEL"   && escolha2 == "PEDRA")    ? "JOGADOR-PERDEU" :
							(escolha1 == "TESOURA" && escolha2 == "PAPEL")    ? "JOGADOR-PERDEU" :
							(escolha1 == "TESOURA" && escolha2 == "PEDRA")    ? "JOGADOR-GANHOU" :
							(escolha1 == "PEDRA"   && escolha2 == "PAPEL")    ? "JOGADOR-GANHOU" :
							(escolha1 == "PEDRA"   && escolha2 == "TESOURA")  ? "JOGADOR-PERDEU" : "ERRO!!!";
		
		System.out.println(ganhador);
	}

}
