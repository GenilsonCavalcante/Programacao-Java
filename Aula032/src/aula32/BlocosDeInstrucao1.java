package aula32;

public class BlocosDeInstrucao1 {
	public static void main(String[] args) {
		//BLOCO DE INSTRUÇÃO
		
		/*
		 * BLOCOs DE INSTRUÇÃO ---> são todas as estruturas que
		 * estão dentro das chaves.
		 */
		
		if(1 == 1) {
			//EXEMPLO: Esse bloco de instrução só será executado se a condição for verdadeira
			//VARIÁVEIS declaradas dentro de um bloco, elas só servirão somente para aquele bloco, fora dele ela não funciona
			
			
			//EXEMPLO:
			
			if(1 == 1) {
				double d = 1;
			}
			 d = 2 // Essa variável não funciona fora do bloco!
					
			
			//Podemos ainda colocar um bloco de comando vazio e manipula-lo códigos dentro dele.
			//Exemplo:		
			{
				System.out.println("O mundo é muito Pequeno!!!");
			}
			//Podemos ainda colocar um bloco de instrução dentro de um bloco de instrução;
			{
				int xyz = 0; //podemos fazer isso, declarando em um bloco e chamando no seu sub-bloco, mas não podemos fazer o inverso.
				{
					System.out.println(xyz);
				}
			}
			
			{
				{
					int c = 10;
				}
				System.out.println(c); //Não podemos declarar uma variável em um sub-bloco e chamala na sua origem, bloco que a antecede.
			}
			
		}
		
	}//Final do Bloco de Instrução

}//Final do Bloco de Instrução
