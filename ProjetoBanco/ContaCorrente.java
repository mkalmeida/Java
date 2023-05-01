package ProjetoBanco;

import java.util.Scanner;

public class ContaCorrente extends Conta{

Scanner input = new Scanner(System.in);
	
	int qtdTalaoRestante=0, pedirTalao, qtdTalao=3;
	
	
	public ContaCorrente(int numero, String cpf, double saldo, boolean ativo) {
		super(numero, cpf, saldo, ativo);
		
		System.out.println("CONTA CORRENTE");
		System.out.println("Saldo atual: R$ " + getSaldo());
	}
	
	public void pedirTalao () {

		}
	
@Override
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
					validaDebito = true;
				}
		}
	return saldo;
}

}