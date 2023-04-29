package aula_poo;

public class Carro {
	
		// atributos
		
		String nome;
		String marca;
		int ano;
		int vel;
		
		// atributos
		void acelerar (int aceleracao) {
			vel+=aceleracao;
		}
		
		void frear (int reduzir) {
			vel-=reduzir;
		}
		void buzinar() {
			System.out.println("buzina");
		}

	}


