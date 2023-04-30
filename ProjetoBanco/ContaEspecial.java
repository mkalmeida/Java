package ProjetoBanco;

public class ContaEspecial extends Conta {
	
	double limite;

	public ContaEspecial(int numero, String cpf, double saldo, boolean ativo, double limite) {
		super(numero, cpf, saldo, ativo);
		this.limite = limite;
	}

	
}
