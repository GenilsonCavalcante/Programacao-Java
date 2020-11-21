package aula38;

public class BreakNaPratica {
	public static void main(String[] args) {
		
		labelForX: for(int x = 0; x <= 10; x++) {
			for(int j = 0; j < 10; j++) {//looping anihados, ou seja, loop dentro de loop
				System.out.println("O valor de x é: " + x + " J é: " + j);
				if(j == 9 && x == 3) {
					break labelForX; //Para tanto esse loop, como o loop externo, nomeado de 'labelForX'
				}
				
				
				//Podemos ainda fazer com um WHILE:
//				int a = 0;
//				while(a < 10) {
//					a++;
//					if(a == 5) {
//						break labelForX;
//					}
//				}
			}
		}
	}
}


