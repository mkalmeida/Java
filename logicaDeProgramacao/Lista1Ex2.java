/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias*/

package logicaDeProgramacao;

import java.util.Scanner;

public class Lista1Ex2 {

	public static void main(String[] args) {
		
		int idade, anos, meses, dias;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade expressa em dias: ");
		idade = scan.nextInt();
		
		anos = idade / 365;
		meses = (idade - anos*365) / 30;
		dias = (idade - anos*365 - meses*30);
		
		System.out.println("São " +anos+ " anos, " +meses+ " meses e " +dias+ " dias");

		scan.close();
	
	}

}
