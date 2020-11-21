package aula35;

public class CondicaoTernaria1 {
	public static void main(String[] args) {
		
		/*
		 * Operação Ternária é uma estrutura utilizada para simplificar
		 * o código, onde testamos uma condição e retornamos um valor.
		 * 
		 * DEFINIÇÃO: 
		 * 
		 * <variavel> = (condicao) ? <valor1> : <valor2>;
		 * 
		 * LÊ-SE:
		 * 
		 * <variavel> = (True) SE <valor1> SENÃO <valor2>
		 * 
		 * Ou seja, em uma condição ternária, vafemos uma pergunta para tal condição, se ela for 
		 * verdadeira executa o primeiro comando, senão executa o segundo comando! tudo isso em uma linha apenas.
		 */
		
		//VEJA:
		
	    int a = 5, b = 5;
//		
//		if(a == b) {
//			valor = "VERDADEIRO";
//		}else {
//			valor = "FALSO";
//		}
//		System.out.println(valor);
		
		String valor = (a == 5) ? "VERDADEIRO" : "FALSE";//Economiza-se muitas linhas de códigos.
		System.out.println(valor);
	}

}
