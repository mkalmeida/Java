package ProjetoBanco;

import java.util.Scanner;

public class ContaCorrente extends Conta{

	Scanner input = new Scanner(System.in);
	
	int qtdTalaoRestante=0, pedirTalao, qtdTalao=3;
	
	
	public ContaCorrente(int numero, String cpf, double saldo, boolean ativo) {
		super(numero, cpf, saldo, ativo);
		
		System.out.println("CONTA CORRENTE");
	}
	
	public void pedirTalao () {
				System.out.println("DIGITE A QUANTIDADE DE TALÕES: ");
				qtdTalao = input.nextInt();
				if (saldo < 30.00) {
				System.out.println("SEU SALDO É INFERIOR A R$ 30,00 REAIS. VOCÊ NÃO PODE SOLICITAR TALÕES");
				} else {
					if (qtdTalao > 3) {
						System.out.println("O MÁXIMO DE TALÕES PERMITIDOS É 3");
					}
				}
				System.out.println("VOCÊ SOLICITOU 1 TALÃO COM SUCESSO!");
				qtdTalaoRestante = 3 - qtdTalao;
				qtdTalao = qtdTalao - 1;
				saldo = saldo - 30;
				System.out.println("VOCÊ AINDA PODE SOLICITAR " +qtdTalaoRestante+ " TALÕES");	
	
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
	

