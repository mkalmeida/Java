/*Faça um programa que entre com três números e coloque em ordem crescente*/

package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio2SeSenao {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		a = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b = scan.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		c = scan.nextInt();
		
			if(a>b && b>c) {
				System.out.println("Os números ordenados são: " + c +"\n"+ b +"\n"+ a +"\n");
			} else {
				if (b>c && c>a) {
					System.out.println("Os números ordenados são: " + a +"\n"+ c +"\n"+ b +"\n");
				} if (c>b && a>b) {
						System.out.println("Os números ordenados são: " + b +"\n"+ a +"\n"+ c +"\n");
					} if(a<b && b<c) {
						System.out.println("Os números ordenados são: " + a +"\n"+ b +"\n"+ c +"\n");
					} if(b>a && a>c) {
							System.out.println("Os números ordenados são: " + c +"\n"+ a +"\n"+ b +"\n");
					}
			}
	}

}
