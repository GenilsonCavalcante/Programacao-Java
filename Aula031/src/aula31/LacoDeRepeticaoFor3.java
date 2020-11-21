package aula31;

public class LacoDeRepeticaoFor3 {
	public static void main(String[] args) {
		//Fazendo o for ficar parecido com o while
		
		//Diversas maneiras de se utilizar o FOR
		
		int x = 0;
		for(; x <= 10 ;) {
			System.out.println(x);
			++x;
		}
		
		System.out.println("");
		
		for(int y = 0; y <= 10; ++y) {
			System.out.println(y);
		}
		
		System.out.println("");
		
		int z = 0;
		while(z <= 10) {
			System.out.println(z);
			++z;
		}
		
		System.out.println("");
		
		int xy = 0;
		for(; xy <= 10; ++xy) {
			System.out.println(xy);
		}
		
		System.out.println();
		
		for(int a = 0, b = 10; a <= 10; ++a, --b) {
			System.out.print(a);
			System.out.print(" - ");
			System.out.println(b);
		}
	}

}
