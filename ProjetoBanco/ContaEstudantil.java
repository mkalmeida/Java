package ProjetoBanco;

public class ContaEstudantil extends Conta {

	boolean limiteEstudantil;
	
	public ContaEstudantil(int numero, String cpf, double saldo, boolean ativo, boolean limiteEstudantil) {
		super(numero, cpf, saldo, ativo);
		this.limiteEstudantil = limiteEstudantil;
	}

}
