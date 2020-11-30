package aula52;

public class MediaAritmetica {
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		nums[0] = 9;
		nums[1] = 10;
		nums[2] = 5;
		nums[3] = 6;
		nums[4] = 7;
		
		double media = 0;
		for(int x = 0; x < nums.length; x++) {
			
			media += nums[x];
		}
		System.out.println("A média é: "+ (media/5));
	}

}
