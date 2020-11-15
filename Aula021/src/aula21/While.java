package aula21;

public class While {
	public static void main(String[] args) {
		
		//ESTRUTURA WHILE
		int i = 0;
		while(i <= 9) {
			i += 1;
			System.out.println(i);
		}
		
		System.out.println("***INVERSO***");
		
		while(i >= 1) {
			System.out.println(i);
			i -= 1;
		}
	}
}
