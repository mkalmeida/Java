package exerciciosArray;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		int soma=0, somaDiagonal=0;
		
		int [] [] matriz = new int [3] [3];
		
		Scanner input = new Scanner(System.in);
		
		for (int x = 0; x < matriz.length; x++) {
				for (int y = 0; y < matriz.length; y++) {
					System.out.println("Digite um valor para a posição [" +x+ "] ["+y+ "]: ");
					matriz[x][y]= input.nextInt();
					
					soma = soma + matriz[x][y];
					
					if (matriz[x] == matriz[y]) {
						
						somaDiagonal = somaDiagonal + matriz[x][y];
					}
			}
		}
		
		System.out.println("A soma dos valores da matriz é: "+soma+". E a soma dos valores da diagonal é: " +somaDiagonal);
			
	}

}
