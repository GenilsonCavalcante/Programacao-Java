package aula33;

public class BlocosDeInstrucao2 {
	public static void main(String[] args) {
		
		//O que define o term�nio de muito c�digo � o (;).
		/*
		 * Mas colocar (;) depois de fun��es, e blocos de instru��o, pode gerar graves consequ�ncias;
		 */
		
		int i = 0;
		if(i >= 10);//O (;) indica instru��o nula, por isso ignora essa parte do c�digo e executa o que vem ap�s, o bloco de instru��o
		{
			++i;
		};;;;;;;;;;;;;;;;;;;;;;;;;;//N�o importa a quantidade que for colocada, pois isso indica que � nula.
		
	}

}
