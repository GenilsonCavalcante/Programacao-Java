package revaula36;

import java.util.Scanner;

public class RevCondicaoTernaria2 {
	public static void main(String[] args) {
		
		System.out.println("ESCOLHA UM N�MERO INTEIRO DE 1 � 10:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
//		String num = (n == 1) ? "N�mero Digitado: " + n : (n == 2) ? "N�mero Digitado: " + n : (n == 3) ? "N�mero Digitado: " + n : (n == 4) ? "N�mero Digitado: " + n : (n == 5) ? "N�mero Digitado: " + n : (n == 6)  ? "N�mero Digitado: " + n : (n == 7) ? "N�mero Digitado: " + n : (n == 8) ? "N�mero Digitado: " + n : (n == 9) ? "N�mero Digitado: " + n : (n == 10) ? "N�mero Digitado: " + n : "N�mero Inv�lido";
//		System.out.println(num);
		
		String numero;
		switch(n) {
		case 1 : numero = "N�mero Digitado: " + n;break;
		case 2 : numero = "N�mero Digitado: " + n;break;
		case 3 : numero = "N�mero Digitado: " + n;break;
		case 4 : numero = "N�mero Digitado: " + n;break;
		case 5 : numero = "N�mero Digitado: " + n;break;
		case 6 : numero = "N�mero Digitado: " + n;break;
		case 7 : numero = "N�mero Digitado: " + n;break;
		case 8 : numero = "N�mero Digitado: " + n;break;
		case 9 : numero = "N�mero Digitado: " + n;break;
		case 10 : numero = "N�mero Digitado: " + n;break;
		default : numero = "N�mero Inv�lido!!!";
		}
		System.out.println(numero);
	}

}
