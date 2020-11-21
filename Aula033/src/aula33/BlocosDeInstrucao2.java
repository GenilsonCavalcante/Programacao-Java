package aula33;

public class BlocosDeInstrucao2 {
	public static void main(String[] args) {
		
		//O que define o termínio de muito código é o (;).
		/*
		 * Mas colocar (;) depois de funções, e blocos de instrução, pode gerar graves consequências;
		 */
		
		int i = 0;
		if(i >= 10);//O (;) indica instrução nula, por isso ignora essa parte do código e executa o que vem após, o bloco de instrução
		{
			++i;
		};;;;;;;;;;;;;;;;;;;;;;;;;;//Não importa a quantidade que for colocada, pois isso indica que é nula.
		
	}

}
