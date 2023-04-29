/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package logicaDeProgramacao;

import java.util.Scanner;

public class Lista1Ex1 {

	public static void main(String[] args) {
		
		int segundos, segundosTotal, horas, minutos;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva o tempo em segundos:");
		segundosTotal = scan.nextInt();
		
		horas = segundosTotal/3600;
		segundos = segundosTotal % 60;
		minutos = (segundosTotal - horas*3600 - segundos)/60;
		
		System.out.println("Seu tempo em horas é:" + horas);
		System.out.println("\nSeu tempo em minutos é:" + minutos);
		System.out.println("\nSeu tempo em segundos é:" + segundos);
		
		scan.close();
	
	}

}
