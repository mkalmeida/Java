/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média e o 
 * total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
 * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/
package estruturaRepeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		int n=0;
		double media=0.0, soma=0.0, total=0.0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para parar o programa e coletar a soma, média e total de valores lidos digite um número negativo\n");
	
		n=n+1;
	
		while (n>0) {
			System.out.println("Digite um número: ");
			n = scan.nextInt();
		if (n>0) {
			total = total + 1;
			soma = soma + n;
			media = soma/total;
		}
		}
		
		System.out.println("O total de números é: " + total);
		System.out.println("A soma é: " + soma);
		System.out.printf("A média é: %.2f", media);
	}

}
