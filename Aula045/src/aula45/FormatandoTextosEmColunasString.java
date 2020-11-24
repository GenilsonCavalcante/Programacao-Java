package aula45;

public class FormatandoTextosEmColunasString {
	public static void main(String[] args) {
		
		int[] array;//Declaração do nosso array.
		array = new int[10]; //Cria e reserva o espaço de 10 elementos para o nosso array
		System.out.printf("%s%10s\n", " _______", "________ ");
		System.out.printf("%s%10s\n", " Indice", "Valores");//printf ---> imprimir texto formatado!
		System.out.printf("%s%10s\n", "/-------", "/--------/");
		for(int i = 0; i <= 9; i++) {
			System.out.printf("/%5d%3s%7d /\n", i, " /", array[i]);
		}
		System.out.printf("%s%10s\n", "/-------", "/--------/");
	}

}
