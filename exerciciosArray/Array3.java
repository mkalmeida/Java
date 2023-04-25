package exerciciosArray;

public class Array3 {

public static void main(String[] args) {
		
		int somaMesmaPosicao, subtracaoMesmaPosicao;
		
		int [] [] n1  = {{4, 6}};
		int [] [] n2 = {{4, 6}};
	
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Matriz N1 [" +i+ "][" +j+ "]" +"é:" + n1[i][j]);
			}
			} for (int i = 0; i < 1; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println("Matriz N2 [" +i+ "][" +j+ "]" +"é:" + n2[i][j]);
				}
			}
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < 2; j++) {			
					if (n1[i][j] == n2[i][j]) {
					
						somaMesmaPosicao = n1[i][j] + n2[i][j];
										
						
						int [] [] m1 = {{somaMesmaPosicao, somaMesmaPosicao}};
						
						System.out.println("Matriz M1 [" +i+ "][" +j+ "]" +"é:" + m1[i][j]);
					}
				}		
			}
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < 2; j++) {			
					if (n1[i][j] == n2[i][j]) {
										
						subtracaoMesmaPosicao = n1[i][j] - n2[i][j];
						
						int [] [] m2 = {{subtracaoMesmaPosicao, subtracaoMesmaPosicao}};
						
						System.out.println("Matriz M2 [" +i+ "][" +j+ "]" +"é:" + m2[i][j]);
				}
			}
		}
	}
}