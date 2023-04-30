package ProjetoBanco;

import java.util.Scanner;

public class Conta {
	
	protected int numero, movimentos=0, opcao=0;
	protected String cpf;
	protected double saldo=1, valor;
	boolean ativo, validaDebito = false, validaCredito = false;
	
	Scanner input = new Scanner(System.in);
	
	public Conta(int numero, String cpf, double saldo, boolean ativo) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
		this.ativo = ativo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	/*Para crédito e débito são solicitadas as opções e caso o saldo seja insuficiente de acordo com a validação  o cliente pode
	 * escolher entre sair ou digitar novamente o valor */
	public boolean credito() {
		
		while (validaCredito == false ) {
			System.out.println("DIGITE O VALOR A SER CREDITADO:");
			valor = input.nextDouble();
			if (valor > 0) {
				saldo = saldo + valor;
				System.out.println("O NOVO SALDO É : R$ " + saldo);
				validaCredito = true;
				movimentos ++;
			} else {
				System.out.println("VALOR INSUFICIENTE PARA SAQUE");
				System.out.println("DIGITE 1 PARA SAIR OU 2 PARA DIGITAR O VALOR NOVAMENTE\n");
				opcao = input.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("VOCÊ DIGITOU SAIR");
					System.out.println("VOLTE SEMPRE!" +"\n"+ "RiVER BANK - O BANCO QUE TE DESAFOGA");
					System.exit(0);
				default:
					if(opcao==2) {
					validaCredito = false;
					} else {
						System.out.println("OPÇÃO INVÁLIDA");
					}
					
				}

			}
		}
		return false;
	}
	
	public boolean debito () {
		while (validaDebito == false ) {
			System.out.println("DIGITE O VALOR A SER DEBITADO:");
			valor = input.nextInt();
			if (saldo == 0 || saldo < valor) {
				System.out.println("NÃO É POSSÍVEL REALIZAR A OPERAÇÃO" + "\n" + "SALDO INSUFICIENTE"+ "\n" + "DIGITE 1 PARA SAIR OU 2 PARA DIGITAR O VALOR NOVAMENTE\n");
				opcao = input.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("VOCÊ DIGITOU SAIR");
					System.out.println("VOLTE SEMPRE!" +"\n"+ "RiVER BANK - O BANCO QUE TE DESAFOGA");
					System.exit(0);
				default:
					if(opcao==2) {
					validaCredito = false;
					} else {
						System.out.println("OPÇÃO INVÁLIDA\n");
					}
				}
					} else {
						saldo = saldo - valor;
						System.out.println("O NOVO SALDO É: R$ " + saldo);
						validaDebito = true;
						movimentos ++;
					}
			}
		return false;
	}
	
}
		
