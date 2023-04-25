package class_scanner;

	import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int quantidade;
		long identificador;
		float altura;
		double area;
		char tipo;
		String palavra;
		
		System.out.println("Digite um valor para a variável quantidade (int): ");
		quantidade = leia.nextInt();
		
		System.out.println("Digite um valor para a variável identificador (long): ");
		identificador = leia.nextLong();
		
		System.out.println("Digite um valor para a variável altura (Float): ");
		altura = leia.nextFloat();
		
		System.out.println("Digite um valor para a variável área (Double): ");
		area = leia.nextDouble();
		
		System.out.println("Digite um valor para a variável tipo (Char): ");
		tipo = leia.next().charAt(0);
	
		System.out.println("Digite um valor para a variável palavra (String): ");
		palavra = leia.next().toString();
		
		
		System.out.println("\nVariável quantidade = " + quantidade);
		System.out.println("\nVariável identificador = " + identificador);
		System.out.println("\nVariável altura = " + altura);
		System.out.println("\nVariável area = " + area);
		System.out.println("\nVariável tipo = " + tipo);
		System.out.println("\nVariável palavra = " + palavra );
		
		leia.close();
		
	}

}
