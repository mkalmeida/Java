package POOAtividades;

public class Cliente {
	
	private String nomeUltimoNome;
	private boolean paisBrasil;
	private double precoFinal;
	private int pedidos;
	private boolean estudante;

// Os pedidos do cliente são contabilizados
		void clientePedir(int qtdpedidos) {
			pedidos += qtdpedidos;
			System.out.println("Seu total de pedidos é: " +pedidos);
		}
		
// Separa os nomes em primeiro e ultimo - Se encontrados espaços, transforma o nome em array dividido 
// pelos espaços e utiliza a primeira e ultima posição.
		
		void separarNomes (boolean trueFalse) {
			
			if (nomeUltimoNome.indexOf(" ") > 0) {
			String arrayNomeUltimoNome[] = nomeUltimoNome.split(" ");
			String nome = arrayNomeUltimoNome[0];
			String ultimoNome = arrayNomeUltimoNome[arrayNomeUltimoNome.length-1];

			System.out.println("O primeiro nome é: *" +nome+ "* e o ultimo é: *" +ultimoNome+ "*");
			} else { 
			System.out.println("Não foi possível separar seu nome, leia as instruções e tente novamente");
			}
		}

// Estudantes recebem descontos a partir do valor que é inserido
		
		void descontoestudante(double desconto) {
			if (estudante == true) {
				precoFinal = precoFinal-(precoFinal*desconto);
				System.out.println("O preco final ficou em: R$ " +precoFinal);
			}else {
			System.out.println("O desconto só é elegivel para estudantes");
			}
		}

// Se for brasileiro ganha 01 brinde conforme escrito
		void brindecopa(String brinde) {
			if (paisBrasil == true) {
			System.out.println("Parabéns você ganhou 01 " +brinde);
			} else {
			System.out.println("Brinde somente para Brasileiros");	
			}
		}

// Visualizar
		void visualizar (){
			System.out.println("O nome é: " +nomeUltimoNome);
			System.out.println("É brasileiro(a)? " +paisBrasil);
			System.out.println("É estudante? " +estudante);
			System.out.println("O preço final é: " +precoFinal);
			System.out.println("O número de pedidos é: " +pedidos);
		}
		
//	Get e Set
		
// Se o nome não tiver espaço aparece a notificação que deve ser escrito utilizando espaços
	public String getnomeUltimoNome() {
		return nomeUltimoNome;
		}

	public void setnomeUltimoNome(String nomeUltimoNome) {
		if (nomeUltimoNome.indexOf(" ") > 0) {
		System.out.println("Cadastro de nome conluido com sucesso");
		} else {
		System.out.println("O nome deve ser escrito separado por espaços");
		}
		this.nomeUltimoNome = nomeUltimoNome;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

	public int getPedidos() {
		return pedidos;
	}

	public void setPedidos(int pedidos) {
		this.pedidos = pedidos;
	}

	public boolean isEstudante() {
		return estudante;
	}

	public void setEstudante(boolean estudante) {
		this.estudante = estudante;
	}
	
	public boolean ispaisBrasil () {
		return paisBrasil;
	}
	
	public void setpaisBrasil (boolean paisBrasil) {
		this.paisBrasil = estudante;
	}

}
