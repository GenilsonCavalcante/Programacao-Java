package aula50;

import java.util.Arrays;
import java.util.Scanner;

public class AtividadeComArray1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] valores = new int[7];
		
		for(int x = 0; x < 7; x++) {
			System.out.println("Digite o " + (x+1) + "° número: ");
			valores[x] = in.nextInt();
		}
		int soma = valores[0]+valores[1]+valores[2]+valores[3]+valores[4]+valores[5]+valores[6];
		
		System.out.println();
		System.out.println("Os valores informados foram: ");
		System.out.println(Arrays.toString(valores)); //Arrays.toString == serve para que possamos printar na tela os valores do array informado entre parênteses.
		System.out.println("A soma dos elementos informado é: "+soma);
	}

}
