package exerciciosArray;

import java.util.Scanner;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		
		double [] pontuacao = new double[5];
		
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i < pontuacao.length; i++) 
		{
			System.out.println("Digite a pontuação para a posição " +i+ ": ");
			pontuacao[i] = input.nextDouble();

		}
		for (int i=0; i < pontuacao.length; i++) 
		{
		System.out.println("O valor da posição " +i+ " é: " + pontuacao[i]);
		}
		Arrays.sort(pontuacao);
		
		double maior = pontuacao[4];
		
		System.out.println("o maior valor é: " + maior);
		
		input.close();
					
		}
			
	}
