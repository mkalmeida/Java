/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente.*/

package logicaDeProgramacao;

import java.util.Scanner;

public class Lista1Ex3 {

	public static void main(String[] args) {
		
		double n1, n2, n3, nf;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite n1: ");
		n1 = scan.nextInt();

		System.out.println("digite n2: ");
		n2 = scan.nextInt();
		
		System.out.println("digite n3: ");
		n3 = scan.nextInt();
		
		nf = ((n1*2) + (n2*3) + (n3*5))/(n1+n2+n3);
		
		System.out.println("a nota final é: " + nf);
		
		scan.close();
		
	}

}
