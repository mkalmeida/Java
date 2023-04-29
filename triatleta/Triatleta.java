package triatleta;

public class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista {

	public Triatleta(String nome) {
		super(nome);
		System.out.println("O nome é: " + nome);
	}

	@Override
	public void aquecer() {
		System.out.println("\nAquecendo");
		
	}

	@Override
	public void peladar() {
		System.out.println("\nPedalando");
	}

	@Override
	public void corre() {
		System.out.println("\nCorrendo");
	}

	@Override
	public void nadar() {
		System.out.println("\nCorrendo");
	}

}
