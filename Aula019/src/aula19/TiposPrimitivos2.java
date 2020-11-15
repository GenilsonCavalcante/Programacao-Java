package aula19;
/*
 * @author: Genilson
 */
public class TiposPrimitivos2 {
	public static void main(String[] args) {
		
		char c1 = 'a';
		char c2 = '1';
		
		//valor padão 0 a nossa variável do tipo byte.
		//Byte ocupa 1 byte de mamória;
		
		//===========================================================
		
		byte b1 = 100;
		byte b2 = 300; //só podemos atribuir valores a variável do tipo byte, no intervalo de -128 e +127
		//Um Byte armazena 255 byts na memória.
		//Intervalo de -128 e +127.
		
		//===========================================================
		
		short camisa = 2000; //por padrão é atribuido o valor 0 a esse tipo de variável.
		//Os valores vão de -32768 á + 32767;
		
		//===========================================================
		
		int i = 1; //por padrão o java atribui o valor 0 a esse tipo de variável.
		//os valores estão entre o intervalo de -2.147.483.648 até +2.147.486.647
		
		//===========================================================
		
		long l;
		//Esse tipo de variável arazena intervalos muito grandes.
		
		//===========================================================
		
		float f = 4.4f;  
		double d = 2.2;
		//O que diferencia uma da outra é a capacidade de armazenamento, e quando atribuimos um valor flutuante ao float, devemos colocar o f logo após.
		
	}
}
