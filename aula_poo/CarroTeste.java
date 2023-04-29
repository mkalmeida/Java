package aula_poo;

public class CarroTeste {
	
	public static void main(String [] args) {
		
		Carro c1 = new Carro();
		
		c1.nome = "uno";
		c1.marca = "fiat";
		c1.ano= 2015;
		c1.vel = 60;
		
		c1.acelerar(10);
		
		System.out.println(c1.vel);
	}
	
	
}
