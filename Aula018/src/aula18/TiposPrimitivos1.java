package aula18;

/*
 * @author Genilson
 */
public class TiposPrimitivos1 {
	public static void main(String[] args) {
		
		/*
		 * Os tipos primitivos s�o:
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
		//OBS: � fundamental que ao trabalharmos com vari�veis,
		//essas sejam declaradas segundo a sua necessidade, isso
		//para evitar que o programa consuma muita mem�ria do seu
		//computador, isso vale principalmente para estruturas de repeti��o
		//com loops que v�o consumindo muito da mem�ria RAM.
		
		
		boolean b = true; //por pad�o ele sempre ser� false, quando n�o atribuido valor. Ele ocupa 1 Byte.
		
		char c = 'a'; //por pad�o o char � ' ' (vazio); ocupa 2 byte, 16 bits; OBS: n�o usamos aspas duplas para ele, pois ele aceita valores do tipo caractere.
	}

}
