package aula51;

import java.util.Arrays;
import java.util.Scanner;

public class AtividadeComArray2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] valores = new int[7];
		
		
		for(int x = 0; x < 7; x++) {
			System.out.println("Digite o " + (x+1) + "° número: ");
			valores[x] = in.nextInt();
		}
		//int soma = valores[0] + valores[1] + valores[2] + valores[3] + valores[4] + valores[5] + valores[6]; 
		
		System.out.println();
		System.out.println("Os valores informados foram: ");
		System.out.println(Arrays.toString(valores));
		System.out.println();
		
		int soma = 0; //Somar Valores
		int armazenaValor = 0; //Multiplicação dos elementos pelos índices
		
		for(int x = 0; x < 7; x++) {
			soma += valores[x];
			armazenaValor = valores[x]*x;
			System.out.printf("A multiplicação de %d * %d = %d\n", x, valores[x], armazenaValor);
		}

		double media = (soma/7); //Média dos elementos.
		
		System.out.println();
		System.out.println("A soma dos elemetnos informados é: "+soma);
		System.out.println("A média aritmética dos elementos é: "+media);
	}

}
