package aula32;

public class BlocosDeInstrucao1 {
	public static void main(String[] args) {
		//BLOCO DE INSTRU��O
		
		/*
		 * BLOCOs DE INSTRU��O ---> s�o todas as estruturas que
		 * est�o dentro das chaves.
		 */
		
		if(1 == 1) {
			//EXEMPLO: Esse bloco de instru��o s� ser� executado se a condi��o for verdadeira
			//VARI�VEIS declaradas dentro de um bloco, elas s� servir�o somente para aquele bloco, fora dele ela n�o funciona
			
			
			//EXEMPLO:
			
			if(1 == 1) {
				double d = 1;
			}
			 d = 2 // Essa vari�vel n�o funciona fora do bloco!
					
			
			//Podemos ainda colocar um bloco de comando vazio e manipula-lo c�digos dentro dele.
			//Exemplo:		
			{
				System.out.println("O mundo � muito Pequeno!!!");
			}
			//Podemos ainda colocar um bloco de instru��o dentro de um bloco de instru��o;
			{
				int xyz = 0; //podemos fazer isso, declarando em um bloco e chamando no seu sub-bloco, mas n�o podemos fazer o inverso.
				{
					System.out.println(xyz);
				}
			}
			
			{
				{
					int c = 10;
				}
				System.out.println(c); //N�o podemos declarar uma vari�vel em um sub-bloco e chamala na sua origem, bloco que a antecede.
			}
			
		}
		
	}//Final do Bloco de Instru��o

}//Final do Bloco de Instru��o
