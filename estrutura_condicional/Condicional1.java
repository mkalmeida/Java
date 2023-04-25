package estrutura_condicional;
	
	import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if(media >= 6) {
			
			System.out.println("Parabéns você foi aprovade");
		} else if (media == 5) {
			
			System.out.println("Alune de exame");
		}
		
		else {
			
			System.out.println("Infelizmente você foi reprovade");
		}
		
		leia.close();
	}

}
