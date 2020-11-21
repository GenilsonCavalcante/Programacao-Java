package aula6;

public class Variaveis3 {
	public static void main(String[] args) {
		
		int num1, num2;
		num1 = 100;
		num2 = num1 + 100;
		
		System.out.println("O resultado é: " + (num1 + num2));
		//OBS: não podemos somar dois números mais uma string! Pois assim, os números serão considerados como uma string.
		
		//TESTES:
		
		String texto = " mais ";
		String texto2 = " é igual á ";
		int n1 = 1;
		
		System.out.println(n1 + texto + n1 + texto2 + (n1 + n1));
	}

}
