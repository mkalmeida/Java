/*Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando
de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver*/

package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio1ParaEnquanto {

	public static void main(String[] args) {
		
		int n = 233;
		
		do {
			
			if ((n>= 300) && (n<=400)) {
				n = n+3;
				System.out.println(n);
				System.out.println("Somando de 3 em 3");
			} else {
				n = n+5;
				System.out.println(n);
				System.out.println("Somando de 5 em 5");
			}
		} while (n<=456);
	}
}

