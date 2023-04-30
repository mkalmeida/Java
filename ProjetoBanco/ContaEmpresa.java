package ProjetoBanco;

public class ContaEmpresa extends Conta {
	
	boolean pedirEmprestimo;

	public ContaEmpresa(int numero, String cpf, double saldo, boolean ativo, boolean pedirEmprestimo) {
		super(numero, cpf, saldo, ativo);
		this.pedirEmprestimo = pedirEmprestimo;
	}

	
}
