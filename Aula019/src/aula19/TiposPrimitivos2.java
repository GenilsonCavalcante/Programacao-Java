package aula19;
/*
 * @author: Genilson
 */
public class TiposPrimitivos2 {
	public static void main(String[] args) {
		
		char c1 = 'a';
		char c2 = '1';
		
		//valor pad�o 0 a nossa vari�vel do tipo byte.
		//Byte ocupa 1 byte de mam�ria;
		
		//===========================================================
		
		byte b1 = 100;
		byte b2 = 300; //s� podemos atribuir valores a vari�vel do tipo byte, no intervalo de -128 e +127
		//Um Byte armazena 255 byts na mem�ria.
		//Intervalo de -128 e +127.
		
		//===========================================================
		
		short camisa = 2000; //por padr�o � atribuido o valor 0 a esse tipo de vari�vel.
		//Os valores v�o de -32768 � + 32767;
		
		//===========================================================
		
		int i = 1; //por padr�o o java atribui o valor 0 a esse tipo de vari�vel.
		//os valores est�o entre o intervalo de -2.147.483.648 at� +2.147.486.647
		
		//===========================================================
		
		long l;
		//Esse tipo de vari�vel arazena intervalos muito grandes.
		
		//===========================================================
		
		float f = 4.4f;  
		double d = 2.2;
		//O que diferencia uma da outra � a capacidade de armazenamento, e quando atribuimos um valor flutuante ao float, devemos colocar o f logo ap�s.
		
	}
}
