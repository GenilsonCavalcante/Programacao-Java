package aula57;

public class ForEach2 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		nums[0] = 125;
		nums[1] = 5487;
		nums[2] = 45;
		nums[3] = 457;
		nums[4] = 887;
		nums[5] = 1;
		nums[6] = 4087;
		nums[7] = 1287;
		nums[8] = 5456;
		nums[9] = 789841;
		
		//Imprime a média aritmética!
		int soma = 0;
		for(int item : nums) {
			soma += item;
		}
		float media = soma / nums.length;
		System.out.println("A média aritmética é: "+media);

		
		//Imprime o menor valor da lista!
		int menor = 0;
		int maior = 0;
		for(int item : nums ) {
			if(item < menor || menor == 0) 
				menor = item;
			if(item > maior)
				maior = item;
			
		}
		System.out.println("O menor valor é: "+menor+" e o maior é: "+maior);
	}
}
