package ProjetoBanco;

import java.util.Scanner;

public class Conta {
	
	protected int numero, movimentos=0, opcao=0, diaAniversarioPoupanca;
	protected String cpf;
	protected double saldo=0, valor=0;
	boolean ativo, validaDebito = false, validaCredito = false;
	
	Scanner input = new Scanner(System.in);
	
	public Conta(int numero, String cpf, double saldo, boolean ativo, int diaAniversarioPoupanca) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
		this.ativo = ativo;
		this.diaAniversarioPoupanca=diaAniversarioPoupanca;
	}
	

	
	public int login() {
		System.out.println("NUMERO DA CONTA: " + this.numero);
		System.out.println("CPF: " + this.cpf);
		System.out.println("DIA: " + this.diaAniversarioPoupanca);
		System.out.println("--------------------------------------------------------");
		return this.diaAniversarioPoupanca;
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
	
	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}


	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	/*Para crédito e débito são solicitadas as opções e caso o saldo seja insuficiente de acordo com a validação  o cliente pode
	 * escolher entre sair ou digitar novamente o valor */
	public double credito(double valor) {
		
		while (validaCredito == false ) {
			if (valor > 0) {
				validaCredito = true;
				movimentos ++;
			} else {
				System.out.println("NÃO É PERMITIDO CRÉDITO DE r$ 0,00 REAIS");
				System.out.println("DIGITE 1 PARA SAIR OU 2 PARA DIGITAR O VALOR NOVAMENTE\n");
				saldo = valor + this.saldo;
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
		return saldo;

	}
	
	public double debito (double valor) {
		while (validaDebito == false ) {
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
					validaDebito = false;
					} else {
						System.out.println("OPÇÃO INVÁLIDA\n");
					}
				}
					} else {
						validaDebito = true;
					}
			}
		return saldo;
	}

	}