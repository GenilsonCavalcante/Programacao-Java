package revaula36;

import java.util.Scanner;

public class RevCondicaoTernaria2 {
	public static void main(String[] args) {
		
		System.out.println("ESCOLHA UM NÚMERO INTEIRO DE 1 Á 10:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
//		String num = (n == 1) ? "Número Digitado: " + n : (n == 2) ? "Número Digitado: " + n : (n == 3) ? "Número Digitado: " + n : (n == 4) ? "Número Digitado: " + n : (n == 5) ? "Número Digitado: " + n : (n == 6)  ? "Número Digitado: " + n : (n == 7) ? "Número Digitado: " + n : (n == 8) ? "Número Digitado: " + n : (n == 9) ? "Número Digitado: " + n : (n == 10) ? "Número Digitado: " + n : "Número Inválido";
//		System.out.println(num);
		
		String numero;
		switch(n) {
		case 1 : numero = "Número Digitado: " + n;break;
		case 2 : numero = "Número Digitado: " + n;break;
		case 3 : numero = "Número Digitado: " + n;break;
		case 4 : numero = "Número Digitado: " + n;break;
		case 5 : numero = "Número Digitado: " + n;break;
		case 6 : numero = "Número Digitado: " + n;break;
		case 7 : numero = "Número Digitado: " + n;break;
		case 8 : numero = "Número Digitado: " + n;break;
		case 9 : numero = "Número Digitado: " + n;break;
		case 10 : numero = "Número Digitado: " + n;break;
		default : numero = "Número Inválido!!!";
		}
		System.out.println(numero);
	}

}
