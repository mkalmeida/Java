/*Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele.
 *  Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28*/


package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio2ParaEnquanto {

	public static void main(String[] args) {
		
		
		int n, c, i=0, soma=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva um número para saber a soma de todos os anteriores até ele:\n");
		n = scan.nextInt();
		
		c = n;
		
		do {
			c = c - 1;
			soma = soma + c;
		} while (c>=1);
			soma = soma + n;
			System.out.println(soma + "\n");
	}

}
