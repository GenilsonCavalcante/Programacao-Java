package aula51;

import java.util.Arrays;
import java.util.Scanner;

public class AtividadeComArray2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] valores = new int[7];
		
		
		for(int x = 0; x < 7; x++) {
			System.out.println("Digite o " + (x+1) + "� n�mero: ");
			valores[x] = in.nextInt();
		}
		//int soma = valores[0] + valores[1] + valores[2] + valores[3] + valores[4] + valores[5] + valores[6]; 
		
		System.out.println();
		System.out.println("Os valores informados foram: ");
		System.out.println(Arrays.toString(valores));
		System.out.println();
		
		int soma = 0; //Somar Valores
		int armazenaValor = 0; //Multiplica��o dos elementos pelos �ndices
		
		for(int x = 0; x < 7; x++) {
			soma += valores[x];
			armazenaValor = valores[x]*x;
			System.out.printf("A multiplica��o de %d * %d = %d\n", x, valores[x], armazenaValor);
		}

		double media = (soma/7); //M�dia dos elementos.
		
		System.out.println();
		System.out.println("A soma dos elemetnos informados �: "+soma);
		System.out.println("A m�dia aritm�tica dos elementos �: "+media);
	}

}
