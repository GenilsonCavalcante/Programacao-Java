package aula12;

import java.util.Scanner;

public class Depuracao {
	public static void main(String[] args) {
		
		//Depuração é uma ferramenta últil para podermos executar determinadas linhas de comandos.
		//Esta é importante para detectarmos erros correspondentes.
		
		/*
		 * Para se fazer uma depuração, clica-se duas vezes em uma determinada linha
		 * e clica em debug, apertando F6 no teclado, o código vai sendo executado linha a linha.
		 */
		
		double nota1, nota2, nota3, nota4, media;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite sua 1° nota: ");
		nota1 = in.nextDouble();
		
		System.out.println("Digite sua 2° nota: ");
		nota2 = in.nextDouble();
		
		System.out.println("Digite sua 3° nota: ");
		nota3 = in.nextDouble();
		
		System.out.println("Digite sua 4° nota: ");
		nota4 = in.nextDouble();
		
		media = ((nota1 + nota2 + nota3 + nota4)/4);
		System.out.println("A sua média foi: " + media);
		
		if(media >= 7) {
			System.out.println("Parabéns, você passou!!!");
			if(media == 10) {
				System.out.println("Expetacular, você atingiu a nota máxima");
			}
		}else {
			System.out.println("Infelismente você não passou. Estude mais na próxima!");
		}
	}

}
