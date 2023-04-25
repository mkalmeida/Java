package estruturaRepeticao;

	import java.util.Scanner;

public class Repeticao1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int contador;
		
		for (contador = 1; contador < 4; contador++) {
			System.out.println("\nDigite o " + contador + "° nome: ");
			nome = leia.nextLine();
			
			
			System.out.println("O " + contador + "° nome é:" + nome);
			
			
			
			
			
		}
		

	}

}
