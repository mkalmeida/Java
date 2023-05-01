package ProjetoBanco;

public class ContaEstudantil extends Conta {
	
	protected int numero, movimentos=0, opcao=0;
	protected double saldo=0, valor=0;
	boolean ativo, validaDebito = false, validaCredito = false;	
	double limiteEstudantil;
	
	public ContaEstudantil(int numero, String cpf, double saldo, boolean ativo, double limiteEstudantil) {
		super(numero, cpf, saldo, ativo);
		this.limiteEstudantil = limiteEstudantil;
		
		System.out.println("CONTA ESTUDANTIL");
	}
	
	public double usarLimiteEstudantil(double valor) {
		limiteEstudantil = 5000 - valor;
		saldo = getSaldo() + valor;
		System.out.println("SEU LIMITE ESTUDANTIL RESTANTE É DE R$:" +limiteEstudantil);
		return saldo;
	}
	public double credito(double valor) {
		
		while (validaCredito == false ) {
			if (valor > 0) {
				saldo = getSaldo() + valor;
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
					validaCredito = false;
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

