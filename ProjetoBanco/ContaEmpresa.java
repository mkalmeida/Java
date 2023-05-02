package ProjetoBanco;

public class ContaEmpresa extends Conta {
	
	protected int numero, movimentos=0, opcao=0;
	protected double saldo=0, valor=0, limiteEmprestimo=0;
	boolean ativo, validaDebito = false, validaCredito = false, validaEmprestimo = false;

	public ContaEmpresa(int numero, String cpf, double saldo, boolean ativo,int diaAniversarioPoupanca) {
		super(numero, cpf, saldo, ativo, diaAniversarioPoupanca);
		
		System.out.println("CONTA EMPRESA");

	}
	
	
	public double emprestimoEmpresa (double valor) {
		limiteEmprestimo = 10000 - valor;
		saldo = getSaldo() + valor;
		return saldo;
		
	}
		
		

public double credito(double valor) {
		
		while (validaCredito == false ) {
			if (valor > 0) {
				validaCredito = true;
				saldo = getSaldo() + valor;
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
	