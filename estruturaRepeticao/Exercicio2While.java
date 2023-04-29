/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) 
 * até que ele seja maior do que 100. Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135*/

package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio2While {

	public static void main(String[] args) {
		
		int n;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:\n");
		n = scan.nextInt();
		
		while (n<=100) {
			n=n*3;
			System.out.println(n+"\n");
		}

	}

}
