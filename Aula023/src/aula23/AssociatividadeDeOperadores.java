package aula23;

public class AssociatividadeDeOperadores {
	public static void main(String[] args) {
		
		//Associatividade de Operadores
		//Isso se refere sobre a direção que o java trabalha com os operadores.
		//Ex: em uma operação de adição, o java executa da esquerda para a direita.
		//Mas isso pode ser alterado com o uso de precedências, os parênteses().
		
		//EXEMPLOS:
		
		/*NÍVEIS de precedência(Esquerda para Direita):
		 * 1) ()
		 * 2) *; /; %
		 * 3) +; -
		 * 4) <; <=; >; >=
		 * 5) ==; !=
		 * 
		 */
		/*NÍVEIS de precedência(Direita para Esquerda):
		 * 1) =     ---> Atribuição vai da direita para esquerda!
		 * 
		 */
		
		int x, y, z;
		x = (y = (z = 0));//Nessa forma, o valor zero está sendo atribuido da direita para a esquerda, precedência dos parênteses
		
		int a = (x + y) + z;//Nessa forma, o valor está sendo adicionado da esquerda para a direita.
	}

}
