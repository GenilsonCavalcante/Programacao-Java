package aula25;

public class OperadoresDeAtribuicao {
	public static void main(String[] args) {
		
		int i = 0;
		
		i = i + 1;
		System.out.println(i);
		
		i += 1;//Operador de Atribuição
		System.out.println(i);
		
		/*
		 * São os operadores de Atribuição:
		 * 
		 * x += y;
		 * x -= y;
		 * 
		 * x *= y;
		 * x /= y;
		 * 
		 * x %= y;
		 */
		
		int x = 12, y = 4;
		
		System.out.println(" ---------- ");
		System.out.println(x += y);
		System.out.println(x -= y);
		System.out.println(" ---------- ");
		System.out.println(x *= y);
		System.out.println(x /= y);
		System.out.println(" ---------- ");
		System.out.println(x %= y);
	}

}
