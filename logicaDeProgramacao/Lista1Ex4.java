package logicaDeProgramacao;

import java.util.Scanner;

public class Lista1Ex4 {

	public static void main(String[] args) {
	
		double x1, x2, y1, y2, d;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor x1: ");
		x1 = scan.nextInt();
		
		System.out.println("Digite o valor x2: ");
		x2 = scan.nextInt();
		
		System.out.println("Digite o valor y1: ");
		y1 = scan.nextInt();
		
		System.out.println("Digite o valor y2: ");
		y2 = scan.nextInt();
		
		
		d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.println("\nA tal distância é " +d);
		
		scan.close();
		
		

	}

}
