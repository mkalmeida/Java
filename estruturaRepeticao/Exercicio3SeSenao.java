/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/

package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio3SeSenao {

	public static void main(String[] args) {
	
		int idade;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma idade entre 10 e 25 para saber se é infantil, juvenil ou adulto ");
		idade = scan.nextInt();
		
		if (idade>=10 && idade<=14) {
			System.out.println("A idade " +idade+ " é infantil");
		} else {
			if (idade>=15 && idade<=17) {
			System.out.println("A idade " +idade+ " é juvenil");
		} if (idade>=18 && idade<=25) {
			System.out.println("A idade " +idade+ " é adulto");
		}
		
		}
	}

}
