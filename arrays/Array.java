package arrays;

public class Array {

	public static void main(String[] args) {
		int[] x = new int [10];
		x[9] = 8;
		
		System.out.println("O tamanho do array é: " + x.length);
		
		for (int i = 0; i < x.length; i++)
		{
			x[i] = i * 2;
			
		} 
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println("O valor da posição " +i+ " é: " + x[i]);
			
		}
		
	}

}
