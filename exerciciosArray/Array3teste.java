package exerciciosArray;

public class Array3teste {

	public static void main(String[] args) {
		
		int somaMesmaPosicao, subtracaoMesmaPosicao;
		
		int [] [] n1  = {{4, 6}};
		int [] [] n2 = {{4, 6}};
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Para N1 [" +i+ "][" +j+ "]" +"é:" + n1[i][j]);
				System.out.println("Para N2 [" +i+ "][" +j+ "]" +"é:" + n2[i][j]);
				
				if (n1[i][j] == n2[i][j]) {
				
					somaMesmaPosicao = n1[i][j] + n2[i][j];
					
					int [] [] m1 = {{somaMesmaPosicao, somaMesmaPosicao}};
					
						for (int x = 0; x < 1; x++) {
							for (int y = 0; y < 2; y++) {
							System.out.println("Para M1 [" +x+ "][" +y+ "]" +"é:" + m1[x][y]);
						}
					}
				}
				
				if (n1[i][j] == n2[i][j]) {
				
				subtracaoMesmaPosicao = n1[i][j] - n2[i][j];
				
				int [] [] m1 = {{subtracaoMesmaPosicao, subtracaoMesmaPosicao}};
				
					for (int x = 0; x < 1; x++) {
						for (int y = 0; y < 2; y++) {
						System.out.println("Para M2 [" +x+ "][" +y+ "]" +"é:" + m1[x][y]);
						}
					}
				}
			}
		}
	}		
}
			

