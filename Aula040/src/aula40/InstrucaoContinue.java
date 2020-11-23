package aula40;

public class InstrucaoContinue {
	public static void main(String[] args) {
		
		/*
		 * A instru��o CONTINUE � utilizada dentro de um looping
		 * no momento em que desejamos encerrar um ciclo. Ao contr�rio 
		 * da instru��o break que encerra o looping, a instru��o continue encerra somente um �nico ciclo.
		 */
		
		System.out.println("Imprimindo os n�meros pares de 0 � 100");
		for(int i = 0; i <= 100; i++) {
			if(i%2==0) {
				System.out.println(i);
			}else {
				continue;
			}
			
			int a = 0, soma = 0;
			while(a<i) {
				a++;
				soma += a;
			}
			System.out.println("A soma de todos os n�meros �: " + soma);
		}
	}

}
