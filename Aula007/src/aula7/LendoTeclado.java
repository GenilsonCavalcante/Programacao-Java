package aula7;

import java.util.Scanner; // pacote para pegar um n�mero digitado no teclado.
//Usamos classes para poder integrar-las a esta e us�-la

public class LendoTeclado {
	public static void main(String[] args) {
		
		System.out.println("Digite um n�mero: ");
		Scanner in = new Scanner(System.in);
		System.out.println("Voc� digitou: " + in.nextLine());
	}

}
