package aula6;

public class Variaveis3 {
	public static void main(String[] args) {
		
		int num1, num2;
		num1 = 100;
		num2 = num1 + 100;
		
		System.out.println("O resultado �: " + (num1 + num2));
		//OBS: n�o podemos somar dois n�meros mais uma string! Pois assim, os n�meros ser�o considerados como uma string.
		
		//TESTES:
		
		String texto = " mais ";
		String texto2 = " � igual � ";
		int n1 = 1;
		
		System.out.println(n1 + texto + n1 + texto2 + (n1 + n1));
	}

}
