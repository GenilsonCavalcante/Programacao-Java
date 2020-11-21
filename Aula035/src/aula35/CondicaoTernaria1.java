package aula35;

public class CondicaoTernaria1 {
	public static void main(String[] args) {
		
		/*
		 * Opera��o Tern�ria � uma estrutura utilizada para simplificar
		 * o c�digo, onde testamos uma condi��o e retornamos um valor.
		 * 
		 * DEFINI��O: 
		 * 
		 * <variavel> = (condicao) ? <valor1> : <valor2>;
		 * 
		 * L�-SE:
		 * 
		 * <variavel> = (True) SE <valor1> SEN�O <valor2>
		 * 
		 * Ou seja, em uma condi��o tern�ria, vafemos uma pergunta para tal condi��o, se ela for 
		 * verdadeira executa o primeiro comando, sen�o executa o segundo comando! tudo isso em uma linha apenas.
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
		
		String valor = (a == 5) ? "VERDADEIRO" : "FALSE";//Economiza-se muitas linhas de c�digos.
		System.out.println(valor);
	}

}
