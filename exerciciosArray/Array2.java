package exerciciosArray;

import java.util.Scanner;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		int contSeis = 0;
		double media, soma = 0.0;
		
		int[] dado = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < dado.length; i++) {
			
			System.out.println("Digite o "+(i+1)+"° valor:");
			
			dado[i]= input.nextInt();
			
		} for (int i = 0; i < dado.length; i++) {
			
			System.out.println("O " +(i+1)+ "° valor é: "+dado[i]);
			
		} 
		
		Arrays.sort(dado);
		
		int maior = dado[dado.length-1];
		
		for (int i = 0; i< dado.length; i++) {
			
			soma = dado[i] + soma;
			
			if (dado[i] == maior) {
				
			contSeis = contSeis + 1;
			}
			
		}
		
		media = soma/dado.length;
		
		System.out.println("\nA média é " +media+ " e a quantidade de vezes que o maior número (" + maior + ") apareceram foram " +contSeis);
		input.close();
	}

}
