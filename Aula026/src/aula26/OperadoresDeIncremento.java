package aula26;

public class OperadoresDeIncremento {
	public static void main(String[] args) {
		//Operadores de Incremento
		
		int i = 0;
		int y = 0;
		
		//Operador de pré-incremento
		i++;
		System.out.println(i);//Atribui o valor antes da operação
		
		//Operador de pós-incremento
		System.out.println(y++);//Atribui o valor depois da operação
		System.out.println(y);//Agora atribuiu o valor
		
		/*
		 * Ou seja:
		 * i++  --->  faz com que o valor seja atribuido antes da instrução, adicionando antes de imprimir o valor
		 * 
		 * ++y  --->  faz com que o valor seja atribuido depois da instrução, adiciona o valor depois dele ser imprimido.
		 */
		
		System.out.println(" -----  DECREMENTO ----- ");
		
		int a = 0;
		int b = 0;
		
		System.out.println(--a);//PRÉ-DECREMENTO - DECREMENTA ANTES DA EXECUÇÃO E DEPOIS EXECUTA
		System.out.println(b--);//PÓS-DECREMENTO - DECREMENTA DEPOIS DA EXECUÇÃO E DEPOIS EXECUTA, SEM O VALOR DECREMENTADO NA EXIBIÇÃO
		System.out.println(b);
		
		//EXEMPLOS:
		
		int x = 0;
		
		x = x + 1;  //FORMA TRADICIONAL
		x += 1;     //OPERADOR DE ATRIBUIÇÃO
		++x;        //OPERADOR DE INCREMENTO
		//Adicionei uma nova linha
	}

}
