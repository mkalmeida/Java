package ProjetoBanco;

import java.util.Scanner;

public class testatudo {

	public static void main(String[] args) {


			int opcao=0;
			boolean validaOpcao=false;
			
			 Scanner input = new Scanner(System.in);
			 
				 
			 while (validaOpcao == false) {
				System.out.println("====================================");
				System.out.println("BOAS VINDAS AO BANCO RIVER BANK: O BANCO QUE TE DESAFOGA");
				System.out.println("==============================================");
				System.out.println("DIGITE A OPÇÃO DESEJADA:");
				System.out.println("1-CONTA POUPANÇA" + "\n" + "2-CONTA CORRENTE" + "\n" + "3-CONTA ESPECIAL" + "\n" + "4-CONTA EMPRESA" + "\n" + "4-CONTA ESTUDANTIL" + "\n" + "6-SAIR");
				opcao = input.nextInt();
				validaOpcao = menu.opcoes(opcao);
				} 
			 
			 input.close();
			
			}		

			int movimentos = 0, dia =0, teste=0;
		 static int opcao;
		 int movimentacao=0, opcaoMovimentacao=0;
		double saldo;
		 boolean validaOpcao = false;
		 static boolean validaContinua=false;
			 static char cont=0;
			
			 Scanner input = new Scanner(System.in);
			 static Scanner scan = new Scanner(System.in);
			 static TesteConta menu = new TesteConta();

				public boolean opcoes (int opcao) {
					switch (opcao) {
					
					case 1:
						ContaPoupanca CPoupanca = new ContaPoupanca(15423, "321.432.543-05", 50.00, true);
						
						System.out.println("DESEJA FAZER MOVIMENTAÇÃO NESTA CONTA?");
						System.out.println("DIGITE 1 PARA SIM E 2 PARA NÃO");
						movimentacao = input.nextInt();
						while(validaOpcao == false) {
						switch (movimentacao) {
							case 1:
								System.out.println("\nDIGITE A OPÇÃO DESEJADA:");
								System.out.println("1-CREDITO" + "\n" + "2-DEBITO");
								opcaoMovimentacao = input.nextInt();
								while(validaOpcao == false) {
									switch (opcao) {
									case 1:
										CPoupanca.credito();
										movimentos ++;
										TesteConta.continua();
										return true;
									case 2:
										CPoupanca.debito();
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
						ContaCorrente CCorrente = new ContaCorrente(15423, "321.432.543-05", 50.00, true);
						
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
										CCorrente.credito();
										movimentos ++;
										saldo = CCorrente.saldo;
							
										TesteConta.continua();
										return true;
									case 2:
										CCorrente.debito();
										movimentos ++;
										TesteConta.continua();
										return true;
									case 3:
										CCorrente.pedirTalao();
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
						System.out.println("CONTA ESPECIAL");
						ContaEspecial CEspecial = new ContaEspecial(15423, "321.432.543-05", 50.00, true, 1000.0);
						return true;
					case 4: 
						System.out.println("CONTA EMPRESA");
						ContaEmpresa CEmpresa = new ContaEmpresa(15423, "321.432.543-05", 50.00, true, true);
						return true;
					case 5:
						System.out.println("CONTA ESTUDANTIL");
						ContaEstudantil CEstudantil = new ContaEstudantil(15423, "321.432.543-05", 50.00, true, true);
						return true;
					case 6: 
						System.out.println("VOCÊ DIGITOU SAIR");
						System.out.println("VOLTE SEMPRE!" +"\n"+ "RiVER BANK - O BANCO QUE TE DESAFOGA");
						System.exit(0);
					case 7: 
						Conta Cteste = new Conta(15423, "321.432.543-05", 50.00, true);
						while (validaOpcao == false) {
							System.out.println("DIGITE A OPÇÃO DESEJADA:");
							System.out.println("1-DEBITO" + "\n" + "2-CREDITO");
							opcao = input.nextInt();
							switch (opcao) {
							case 1: 
								Cteste.debito();
								return true;
							case 2: 
								Cteste.credito();
								return true;
							default:
								System.out.println("OPÇÃO INVALIDA TENTE NOVAMENTE");
								return false;
							}
						}
						return true;
					default: 
						System.out.println("OPÇÃO INVALIDA TENTE NOVAMENTE");
						return false;
					}
					
				}

				
			 	public static void continua() {
			 		
			 		System.out.println("CONTINUAR S/N");
					cont = scan.next().charAt(0);
					
					switch (cont) {
						case 'S':
							while (validaContinua == false) {
								System.out.println("====================================");
								System.out.println("BOAS VINDAS AO BANCO RIVER BANK: O BANCO QUE TE DESAFOGA");
								System.out.println("==============================================");
								System.out.println("DIGITE A OPÇÃO DESEJADA:");
								System.out.println("1-CONTA POUPANÇA" + "\n" + "2-CONTA CORRENTE" + "\n" + "3-CONTA ESPECIAL" + "\n" + "4-CONTA EMPRESA" + "\n" + "4-CONTA ESTUDANTIL" + "\n" + "6-SAIR");
								opcao = scan.nextInt();
								validaContinua = menu.opcoes(opcao);
								} 
							break;
						case 'N':
							System.out.println("VOCÊ DIGITOU SAIR");
							System.out.println("VOLTE SEMPRE!" +"\n"+ "RiVER BANK - O BANCO QUE TE DESAFOGA");
							System.exit(0);
							break;
						default:
							System.out.println("moio");
							break;
					}
					

	}

}
