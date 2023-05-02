package ProjetoBanco;

import java.util.Scanner;

public class ContaPoupanca extends Conta { 
	
	private int diaAniversarioPoupanca=0;
	int movimentos=0;
	double saldoAtual, rendimentos;
	
	Scanner input = new Scanner(System.in);
	
	public ContaPoupanca(int numero, String cpf, double saldo, boolean ativo, int diaAniversarioPoupanca) {
		super(numero, cpf, saldo, ativo, diaAniversarioPoupanca);


		System.out.println("CONTA POUPANÇA");
	}
	
	
	public void ajusteAniversario () {
		if (diaAniversarioPoupanca == 5) {
		saldoAtual = getSaldo()+ (getSaldo()*0.05);
		rendimentos = (getSaldo()*0.05);
		System.out.println("Saldo atual: R$ " + saldoAtual);
		System.out.printf("Rendimentos poupança: R$ %.2f\n", getSaldo()*0.05);
		
		} else {
			System.out.println("Saldo atual: R$ " + getSaldo());
		}
	}

	public int diaAniversarioPoupanca(){
		System.out.println("poup:" + this.diaAniversarioPoupanca);
		return super.diaAniversarioPoupanca;
	}


	public double credito(double valor) {
		
		while (validaCredito == false ) {
			if (valor > 0) {
				validaCredito = true;
				movimentos ++;
			} else {
				System.out.println("NÃO É PERMITIDO CRÉDITO DE r$ 0,00 REAIS");
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
		return saldo;

	}
	
	public double debito (double valor) {
		while (validaDebito == false ) {
			saldo = getSaldo();
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
						saldo = getSaldo();
						validaDebito = true;
					}
			}
		return saldo;
	}
}
