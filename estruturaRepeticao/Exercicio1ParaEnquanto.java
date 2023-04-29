/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar 
 * ele por três  (imprimindo o novo valor) até que ele seja maior do que 100. 
 * Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.*/

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

