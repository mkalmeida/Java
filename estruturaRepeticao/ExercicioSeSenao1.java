/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package estruturaRepeticao;

import java.util.Scanner;

public class ExercicioSeSenao1 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		a = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b = scan.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		c = scan.nextInt();
		
			if(a>b && a>c) {
				System.out.println("O maior número é: " + a);
			} else {
				if (b>a && b>c) {
					System.out.println("O maior número é: " + b);
				} if (c>a && c>b) {
					System.out.println("O maior número é: " + c);
				} 
			}
		}

	

}
