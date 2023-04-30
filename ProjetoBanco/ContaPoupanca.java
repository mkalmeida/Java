package ProjetoBanco;

import java.util.Scanner;

import ProjetoBanco.Conta;

public class ContaPoupanca extends Conta { 
	
	private int diaAniversarioPoupanca=5;
	int movimentos=0;
	
	Scanner input = new Scanner(System.in);
		
	public ContaPoupanca(int numero, String cpf, double saldo, boolean ativo) {
		super(numero, cpf, saldo, ativo);
		
		System.out.println("CONTA [POUPANÇA]");
		System.out.println("DIGITE O DIA: ");
		diaAniversarioPoupanca = input.nextInt();
		
		if (diaAniversarioPoupanca == 5) {
		saldo = saldo + (saldo*0.05);
		System.out.println("Saldo atual: R$ " +saldo);
		System.out.printf("Rendimentos poupança: R$ %.2f\n", saldo*0.05);
		
		} else {
			System.out.println("Saldo atual: R$ " +saldo);
		}
	}
	
	
@Override
public boolean credito() {
	
	while (validaCredito == false ) {
		System.out.println("DIGITE O VALOR A SER CREDITADO:");
		valor = input.nextDouble();
		if (valor > 0) {
			saldo = super.getSaldo() + valor;
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

@Override
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