package aula18;

/*
 * @author Genilson
 */
public class TiposPrimitivos1 {
	public static void main(String[] args) {
		
		/*
		 * Os tipos primitivos são:
		 * 
		 * char        tamanho(Byte): 2 
		 * boolean     tamanho(Byte): 1
		 * byte        tamanho(Byte): 1
		 * short       tamanho(Byte): 2
		 * int         tamanho(Byte): 4
		 * long        tamanho(Byte): 8
		 * float       tamanho(Byte): 4
		 * double      tamanho(Byte): 8
		 */
		//OBS: É fundamental que ao trabalharmos com variáveis,
		//essas sejam declaradas segundo a sua necessidade, isso
		//para evitar que o programa consuma muita memória do seu
		//computador, isso vale principalmente para estruturas de repetição
		//com loops que vão consumindo muito da memória RAM.
		
		
		boolean b = true; //por padão ele sempre será false, quando não atribuido valor. Ele ocupa 1 Byte.
		
		char c = 'a'; //por padão o char é ' ' (vazio); ocupa 2 byte, 16 bits; OBS: não usamos aspas duplas para ele, pois ele aceita valores do tipo caractere.
	}

}
