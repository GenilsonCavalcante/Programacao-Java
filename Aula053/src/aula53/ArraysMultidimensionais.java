package aula53;

public class ArraysMultidimensionais {
	public static void main(String[] args) {
		
		//Arrays Multidimensionais:
		
		/*
		 * Podemos declarar Arrays com quantas dimens�es forem necess�rias.
		 * A quantidade de elementos de um Array � limitada pela quantidade 
		 * de mem�ria dispon�vel no seu computador a ser executado.
		 * 
		 * Array com 2 dimens�es(Tabela) - � quando temos uma valor representado
		 * por uma linha e uma coluna. Ou seja, podemos assimilar isso a uma planilha.
		 * 
		 * EXEMPLO: 
		 * 
		 * int[][] tabela = new int[7][4]; //Onde 7 � o total de linhas e 4 � representado
		 * pelas colunas.
		 */
		
		//Veja:
		
		int[][] lista = new int[5][5];
		
		lista[0][0] = 78;
		lista[1][5] = 15;
		lista[2][4] = 66;
		lista[3][3] = 0;
		lista[4][1] = -89;
		
		//Os Arrys Multidimensionais, neste caso bidimensional, � exercido
		//por exemplo na constru��o do jogo-da-velha!!!
	}

}
