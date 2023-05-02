package ProjetoBanco;

import java.util.Scanner;
import ProjetoBanco.Conta;

public class TesteConta {

	public static void main(String[] args) {


		int numero, diaAniversarioPoupanca;
		String cpf;
		int opcao=0;
		boolean validaOpcao=false;
		
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("NUMERO DA CONTA: ");
		 numero = input.nextInt();
		 System.out.println("CPF: ");
		 cpf = input.next();
		 System.out.println("DIA: ");
		 diaAniversarioPoupanca = input.nextInt();
		
		 
		 Conta c1 = new Conta(numero, cpf, 50.00, true, diaAniversarioPoupanca);
		 
		 
		System.out.println("========================================================");
		System.out.println("BOAS VINDAS AO BANCO RIVER BANK: O BANCO QUE TE DESAFOGA");
		System.out.println("========================================================");
	
		c1.login();
		
			 
		 while (validaOpcao == false) {
			System.out.println("DIGITE A OPÇÃO DESEJADA:");
			System.out.println("1-CONTA POUPANÇA" + "\n" + "2-CONTA CORRENTE" + "\n" + "3-CONTA ESPECIAL" + "\n" + "4-CONTA EMPRESA" + "\n" + "5-CONTA ESTUDANTIL" + "\n" + "6-SAIR");
			opcao = input.nextInt();
			validaOpcao = menu.opcoes(opcao);
			} 
		 
		 input.close();
		
		}		

	int movimentos = 0,diaAniversarioPoupanca, numero;
	static int qtdTalao=0, opcao, qtdTalaoLoop=0;
	int movimentacao=0, opcaoMovimentacao=0;
	static double saldo, limiteLoop=0, valor = 0, rendimentos , saldoLoop, valorLoop = 0;
	double limiteEmprestimo, limiteEstudantil, limiteEspecial;
	boolean validaOpcao = false; 
	static boolean validaContinua=false,ativo =false;
	static char cont=0;
	String cpf;

		
		 Scanner input = new Scanner(System.in);
		 static Scanner scan = new Scanner(System.in);
		 static TesteConta menu = new TesteConta();


		 // menu de contas 
			public boolean opcoes (int opcao) {
				switch (opcao) {
				case 1:
					//Não consegui fazer com que o dia digitado no main fosse recebido por esse case para fazer o cálculo do rendimento
					ContaPoupanca CPoupanca = new ContaPoupanca(15423, "321.432.543-05", 50.00, true, diaAniversarioPoupanca);
					System.out.println("DESEJA FAZER MOVIMENTAÇÃO NESTA CONTA?");
					System.out.println("DIGITE 1 PARA SIM E 2 PARA NÃO");
					movimentacao = input.nextInt();
					CPoupanca.ajusteAniversario();
					rendimentos = CPoupanca.rendimentos;
					while(validaOpcao == false) {
					switch (movimentacao) {
						case 1:
							System.out.println("\nDIGITE A OPÇÃO DESEJADA:");
							System.out.println("1-CREDITO" + "\n" + "2-DEBITO");
							opcaoMovimentacao = input.nextInt();
							while(validaOpcao == false) {
								switch (opcaoMovimentacao) {
								case 1:
									System.out.println("DIGITE O VALOR A SER CREDITADO:");
									valor = input.nextDouble();
									CPoupanca.credito(valor);
									saldoLoop = saldoLoop + valor + rendimentos;
									saldo = CPoupanca.credito(valor) + saldoLoop;
									System.out.println("NOVO SALDO R$ " + saldo);
									saldoLoop = saldo - 50;
									movimentos ++;
									TesteConta.continua();
									return true;
								case 2:
									System.out.println("DIGITE O VALOR A SER DEBITADO:");
									valor = input.nextDouble();
									CPoupanca.debito(valor);
									saldo = CPoupanca.getSaldo() + saldoLoop - valor;
									System.out.println("NOVO SALDO R$ " + saldo );
									saldoLoop = saldo - 50;
									movimentos ++;
									TesteConta.continua();
									return true;
								default:
									System.out.println("OPÇÃO INVALIDA TENTE NOVAMENTE");
									return false;
								}
							}
							return true;
						default:
							TesteConta.continua();
					}
				}
					return true;
				case 2: 
					ContaCorrente CCorrente = new ContaCorrente(15423, "321.432.543-05", 50.00, true, diaAniversarioPoupanca);
					System.out.println("DESEJA FAZER MOVIMENTAÇÃO NESTA CONTA?");
					System.out.println("DIGITE 1 PARA SIM E 2 PARA NÃO");
					movimentacao = input.nextInt();
					
					while(validaOpcao == false) {
					switch (movimentacao) {
						case 1:
							System.out.println("\nDIGITE A OPÇÃO DESEJADA:");
							System.out.println("1-CREDITO" + "\n" + "2-DEBITO"+ "\n"+ "3-PEDIR TALÃO");
							opcao = input.nextInt();
							while(validaOpcao == false) {
								switch (opcao) {
								case 1:
									System.out.println("DIGITE O VALOR A SER CREDITADO:");
									valor = input.nextDouble();
									CCorrente.credito(valor);
									saldoLoop = saldoLoop + valor + rendimentos;
									saldo = CCorrente.credito(valor) + saldoLoop;
									System.out.println("NOVO SALDO R$ " + saldo);
									saldoLoop = saldo - 50;
									movimentos ++;
									TesteConta.continua();
									return true;
								case 2:
									System.out.println("DIGITE O VALOR A SER DEBITADO:");
									valor = input.nextDouble();
									CCorrente.debito(valor);
									saldo = CCorrente.getSaldo() + saldoLoop - valor;
									System.out.println("NOVO SALDO R$ " + saldo );
									saldoLoop = saldo - 50;
									movimentos ++;
									TesteConta.continua();
									return true;
								case 3:
									System.out.println("DIGITE A QUANTIDADE DE TALÕES: ");
									qtdTalao = input.nextInt();
									if (saldo < 30.00 || qtdTalao > 3) {
										System.out.println("SEU SALDO É INFERIOR A R$ 30,00 REAIS OU VOCÊ ULTRAPASSOU O NÚMERO DE TALÕES PERMITIDOS. VOCÊ NÃO PODE SOLICITAR TALÕES");
										} else {
										System.out.println("VOCÊ SOLICITOU 1 TALÃO COM SUCESSO!");
										qtdTalaoLoop = 3 - qtdTalaoLoop;
										saldo = saldo - 30;
										saldoLoop = saldo - 50;
										System.out.println("NOVO SALDO R$ " + saldo);
										}
									movimentos ++;
									TesteConta.continua();
									return true;
								default:
									System.out.println("OPÇÃO INVALIDA TENTE NOVAMENTE");
									return false;
								}
							}
							return true;
						default:
							TesteConta.continua();
					}
					return true;
					}
				case 3:
					ContaEspecial CEspecial = new ContaEspecial(15423, "321.432.543-05", 50.00, true, diaAniversarioPoupanca, 1000.0);
					System.out.println("DESEJA FAZER MOVIMENTAÇÃO NESTA CONTA?");
					System.out.println("DIGITE 1 PARA SIM E 2 PARA NÃO");
					movimentacao = input.nextInt();
					while(validaOpcao == false) {
					switch (movimentacao) {
						case 1:
							System.out.println("\nDIGITE A OPÇÃO DESEJADA:");
							System.out.println("1-CREDITO" + "\n" + "2-DEBITO"+ "\n");
							opcao = input.nextInt();
							while(validaOpcao == false) {
								switch (opcao) {
								case 1:
									System.out.println("DIGITE O VALOR A SER CREDITADO:");
									valor = input.nextDouble();
									saldo = CEspecial.credito(valor);
									saldoLoop = saldoLoop + valor;
									saldo = CEspecial.credito(valor) + saldoLoop - valor;
									System.out.println("NOVO SALDO R$ " + saldo);
									saldoLoop = saldo - 50;
									movimentos ++;
									TesteConta.continua();
									return true;
								case 2:
									System.out.println("DIGITE O VALOR A SER DEBITADO:");
									valor = input.nextDouble();
									CEspecial.debito(valor);
									saldoLoop = saldoLoop + valor;
									saldo = CEspecial.getSaldo() + saldoLoop - valor -valor;
									System.out.println("SALDO R$ " + saldo );
									saldoLoop = saldo - 50;
									if (saldo<0) {
									limiteEspecial = 1000 + saldo;
									System.out.println("O SEU LIMITE DE EMPRESTIMO RESTANTE É R$ " + limiteEspecial );
									saldoLoop = saldoLoop + valor;
									saldo = 1000-limiteEspecial;
									System.out.println("SALDO APÓS O USO DO LIMITE R$: " + saldo);
									saldoLoop = saldo - 50;
									valorLoop = valor;
									}
									movimentos ++;
									TesteConta.continua();
									return true;
								default:
									System.out.println("OPÇÃO INVALIDA TENTE NOVAMENTE");
									return false;
								}
							}
							return true;
						default:
							TesteConta.continua();
					}
					return true;
					}
					
				case 4: 
					ContaEmpresa CEmpresa = new ContaEmpresa (15423, "321.432.543-05", 50.00, true, diaAniversarioPoupanca);
					System.out.println("DESEJA FAZER MOVIMENTAÇÃO NESTA CONTA?");
					System.out.println("DIGITE 1 PARA SIM E 2 PARA NÃO");
					movimentacao = input.nextInt();
					while(validaOpcao == false) {
					switch (movimentacao) {
						case 1:
							System.out.println("\nDIGITE A OPÇÃO DESEJADA:");
							System.out.println("1-CREDITO" + "\n" + "2-DEBITO"+ "\n"+ "3-PEDIR EMPRESTIMO");
							opcao = input.nextInt();
							while(validaOpcao == false) {
								switch (opcao) {
								case 1:
									System.out.println("DIGITE O VALOR A SER CREDITADO:");
									valor = input.nextDouble();
									saldo = CEmpresa.credito(valor);
									saldoLoop = saldoLoop + valor;
									saldo = CEmpresa.credito(valor) + saldoLoop - valor;
									System.out.println("NOVO SALDO R$ " + saldo);
									saldoLoop = saldo - 50;
									movimentos ++;
									TesteConta.continua();
									return true;
								case 2:
									System.out.println("DIGITE O VALOR A SER DEBITADO:");
									valor = input.nextDouble();
									CEmpresa.debito(valor);
									saldo = CEmpresa.getSaldo() + saldoLoop - valor;
									System.out.println("NOVO SALDO R$ " + saldo );
									saldoLoop = saldo - 50;
									movimentos ++;
									TesteConta.continua();
									return true;
								case 3:
									System.out.println("DIGITE O VALOR DO EMPRESTIMO: ");
									valor = input.nextDouble();
									CEmpresa.emprestimoEmpresa(valor);
									saldoLoop = saldoLoop + valor;
									saldo = CEmpresa.emprestimoEmpresa(valor) + saldoLoop - valor;;
									System.out.println("NOVO SALDO R$ " + saldo );
									saldoLoop = saldo - 50;
									limiteEmprestimo = 10000 - valorLoop - valor;
									System.out.println("O SEU LIMITE DE EMPRESTIMO RESTANTE É R$ " + limiteEmprestimo );
									valorLoop = valor;
									movimentos ++;
									TesteConta.continua();
									return true;
								default:
									System.out.println("OPÇÃO INVALIDA TENTE NOVAMENTE");
									return false;
								}
							}
							return true;
						default:
							TesteConta.continua();
					}
					return true;
					}
				case 5:
					ContaEstudantil CEstudantil = new ContaEstudantil(15423, "321.432.543-05", 50.00, true, diaAniversarioPoupanca, 5000);
					System.out.println("DESEJA FAZER MOVIMENTAÇÃO NESTA CONTA?");
					System.out.println("DIGITE 1 PARA SIM E 2 PARA NÃO");
					movimentacao = input.nextInt();
					
					while(validaOpcao == false) {
					switch (movimentacao) {
						case 1:
							System.out.println("\nDIGITE A OPÇÃO DESEJADA:");
							System.out.println("1-CREDITO" + "\n" + "2-DEBITO"+ "\n"+ "3-USAR LIMITE ESTUDANTIL");
							opcao = input.nextInt();
							while(validaOpcao == false) {
								switch (opcao) {
								case 1:
									System.out.println("DIGITE O VALOR A SER CREDITADO:");
									valor = input.nextDouble();
									CEstudantil.credito(valor);
									saldoLoop = saldoLoop + valor;
									saldo = CEstudantil.credito(valor) + saldoLoop - valor;
									System.out.println("NOVO SALDO R$ " + saldo);
									saldoLoop = saldo - 50;
									movimentos ++;
									TesteConta.continua();
									return true;
								case 2:
									System.out.println("DIGITE O VALOR A SER DEBITADO:");
									valor = input.nextDouble();
									CEstudantil.debito(valor);
									saldo = CEstudantil.getSaldo() + saldoLoop - valor;
									System.out.println("NOVO SALDO R$ " + saldo );
									saldoLoop = saldo - 50;
									movimentos ++;
									TesteConta.continua();
									return true;
								case 3:
									System.out.println("DIGITE O VALOR DO LIMITE QUE DESEJA USAR: ");
									valor = input.nextInt();
									CEstudantil.usarLimiteEstudantil(valor);
									saldoLoop = saldoLoop + valor;
									saldo = CEstudantil.usarLimiteEstudantil(valor) + saldoLoop - valor;;
									System.out.println("NOVO SALDO R$ " + saldo );
									saldoLoop = saldo - 50;
									limiteEstudantil = 10000 - valorLoop - valor;
									System.out.println("O SEU LIMITE RESTANTE É R$ " + limiteEstudantil );
									valorLoop = valor;
									movimentos ++;
									TesteConta.continua();
									return true;
								default:
									System.out.println("OPÇÃO INVALIDA TENTE NOVAMENTE");
									return false;
								}
							}
							return true;
						default:
							TesteConta.continua();
					}
					return true;
					}
				case 6: 
					System.out.println("VOCÊ DIGITOU SAIR");
					System.out.println("VOLTE SEMPRE!" +"\n"+ "RiVER BANK - O BANCO QUE TE DESAFOGA");
				}
				return false;
			}
			
			 
			public static void continua() {
		 		
		 		System.out.println("CONTINUAR S/N");
				cont = scan.next().charAt(0);
				
				switch (cont) {
					case 'S':
						while (validaContinua == false) {
							System.out.println("========================================================");
							System.out.println("BOAS VINDAS AO BANCO RIVER BANK: O BANCO QUE TE DESAFOGA");
							System.out.println("========================================================");
							System.out.println("DIGITE A OPÇÃO DESEJADA:");
							System.out.println("1-CONTA POUPANÇA" + "\n" + "2-CONTA CORRENTE" + "\n" + "3-CONTA ESPECIAL" + "\n" + "4-CONTA EMPRESA" + "\n" + "5-CONTA ESTUDANTIL" + "\n" + "6-SAIR");
							opcao = scan.nextInt();
							while (ativo == true) {
							saldoLoop = valorLoop + valor;
							qtdTalaoLoop = qtdTalao + qtdTalaoLoop;
							valorLoop = valorLoop - valor;
							}
							validaContinua = menu.opcoes(opcao);
							} 
						break;
					case 'N':
						System.out.println("VOCÊ DIGITOU SAIR");
						System.out.println("VOLTE SEMPRE!" +"\n"+ "RiVER BANK - O BANCO QUE TE DESAFOGA");
						System.exit(0);
						break;
					default:
						System.out.println("OPÇÃO OPÇAO INVALIDA");
						break;
				}
				

}
}