package aula26;

public class OperadoresDeIncremento {
	public static void main(String[] args) {
		//Operadores de Incremento
		
		int i = 0;
		int y = 0;
		
		//Operador de pr�-incremento
		i++;
		System.out.println(i);//Atribui o valor antes da opera��o
		
		//Operador de p�s-incremento
		System.out.println(y++);//Atribui o valor depois da opera��o
		System.out.println(y);//Agora atribuiu o valor
		
		/*
		 * Ou seja:
		 * i++  --->  faz com que o valor seja atribuido antes da instru��o, adicionando antes de imprimir o valor
		 * 
		 * ++y  --->  faz com que o valor seja atribuido depois da instru��o, adiciona o valor depois dele ser imprimido.
		 */
		
		System.out.println(" -----  DECREMENTO ----- ");
		
		int a = 0;
		int b = 0;
		
		System.out.println(--a);//PR�-DECREMENTO - DECREMENTA ANTES DA EXECU��O E DEPOIS EXECUTA
		System.out.println(b--);//P�S-DECREMENTO - DECREMENTA DEPOIS DA EXECU��O E DEPOIS EXECUTA, SEM O VALOR DECREMENTADO NA EXIBI��O
		System.out.println(b);
		
		//EXEMPLOS:
		
		int x = 0;
		
		x = x + 1;  //FORMA TRADICIONAL
		x += 1;     //OPERADOR DE ATRIBUI��O
		++x;        //OPERADOR DE INCREMENTO
		//Adicionei uma nova linha
	}

}
