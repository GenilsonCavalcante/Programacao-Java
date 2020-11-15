package aula23;

public class AssociatividadeDeOperadores {
	public static void main(String[] args) {
		
		//Associatividade de Operadores
		//Isso se refere sobre a dire��o que o java trabalha com os operadores.
		//Ex: em uma opera��o de adi��o, o java executa da esquerda para a direita.
		//Mas isso pode ser alterado com o uso de preced�ncias, os par�nteses().
		
		//EXEMPLOS:
		
		/*N�VEIS de preced�ncia(Esquerda para Direita):
		 * 1) ()
		 * 2) *; /; %
		 * 3) +; -
		 * 4) <; <=; >; >=
		 * 5) ==; !=
		 * 
		 */
		/*N�VEIS de preced�ncia(Direita para Esquerda):
		 * 1) =     ---> Atribui��o vai da direita para esquerda!
		 * 
		 */
		
		int x, y, z;
		x = (y = (z = 0));//Nessa forma, o valor zero est� sendo atribuido da direita para a esquerda, preced�ncia dos par�nteses
		
		int a = (x + y) + z;//Nessa forma, o valor est� sendo adicionado da esquerda para a direita.
	}

}
