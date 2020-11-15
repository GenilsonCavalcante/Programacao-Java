package aula7;

import java.util.Scanner; // pacote para pegar um número digitado no teclado.
//Usamos classes para poder integrar-las a esta e usá-la

public class LendoTeclado {
	public static void main(String[] args) {
		
		System.out.println("Digite um número: ");
		Scanner in = new Scanner(System.in);
		System.out.println("Você digitou: " + in.nextLine());
	}

}
