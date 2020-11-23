package aula40;

public class InstrucaoContinue {
	public static void main(String[] args) {
		
		/*
		 * A instrução CONTINUE é utilizada dentro de um looping
		 * no momento em que desejamos encerrar um ciclo. Ao contrário 
		 * da instrução break que encerra o looping, a instrução continue encerra somente um único ciclo.
		 */
		
		System.out.println("Imprimindo os números pares de 0 á 100");
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
			System.out.println("A soma de todos os números é: " + soma);
		}
	}

}
