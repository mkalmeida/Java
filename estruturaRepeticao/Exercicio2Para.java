/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500.*/

package estruturaRepeticao;

public class Exercicio2Para {

	public static void main(String[] args) {
		
		int  s = 0, c;
		
		for (c=1; c<=500; c=c+1) {
			if ((c%2 != 0) && (c%3 == 0)) {
				s = s+c;
			}
		}
		System.out.println("A soma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500 é: " + s);
		
		
	}

}
