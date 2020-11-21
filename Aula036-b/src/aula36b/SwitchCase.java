package aula36b;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite 1 para DOMINGO e 7 para S�BADO");
		int diaDaSemana = in.nextInt();
		
		String nomeDoDia;
		switch(diaDaSemana) {
		case 1 : nomeDoDia = "Domingo"; break;//Sempre adicionado um break para caso a condi��o for verdadeira, ele para.
		case 2 : nomeDoDia = "Segunda"; break;
		case 3 : nomeDoDia = "Ter�a"; break;
		case 4 : nomeDoDia = "Quarta"; break;
		case 5 : nomeDoDia = "Quinta"; break;
		case 6 : nomeDoDia = "Sexta"; break;
		case 7 : nomeDoDia = "S�bado"; break;
		default : nomeDoDia = "Dia-Inv�lido"; break;//O default serve para ser executado, caso as condi��es anteriores sejem falsas.
		}
		System.out.println(nomeDoDia);
	}

}
