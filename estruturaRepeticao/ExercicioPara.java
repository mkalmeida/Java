/*A prefeitura de uma cidade fez uma pesquisa entre 3 de seus habitantes, coletando
dados sobre o salário e número de filhos. A prefeitura deseja saber:
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/

package estruturaRepeticao;

import java.util.Scanner;

public class ExercicioPara {

	public static void main(String[] args) {
		
		int filhos, c, f = 0;
		double sal, mediaF, mediaS, salarioMaior = 0.0 , salarioMenor, s = 0.0, pSalMenor = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (c=1; c<=3; c=c+1) {
			System.out.println("Digite seu salário\n");
			sal = scan.nextDouble();
			
			System.out.println("Digite a quantidade de filhos\n");
			filhos = scan.nextInt();
			
			f = f + filhos;
			s = s + sal;
			
			if (c == 1){
				salarioMaior = sal;
			} else {
				if (sal > salarioMaior) {
					sal = salarioMaior;
				} if (sal < 100) {
					pSalMenor = pSalMenor + 1;
				}
				
			}
			
		}
		
		mediaS = s/(c-1);
		mediaF = f/(c-1);
		salarioMenor = (pSalMenor/(c-1))*100;
		
		System.out.printf("A média do salario é : %.2f\n", mediaS);
		System.out.println("A média de filhos é: " +mediaF+ "\nO maior salário é: " +salarioMaior);
		System.out.printf("A taxa de pessoas com salario menor que 100 é: %.2f", salarioMenor);

		scan.close();
	}

}
