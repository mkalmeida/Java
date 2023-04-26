package POOAtividades;

public class ClienteTeste {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
	
// Cliente 1
		
		cliente1.setnomeUltimoNome("Michaella Santos Fernandes de Almeida");
		cliente1.setPrecoFinal(50.0);
		cliente1.setPedidos(5);
		cliente1.setEstudante(true);
		cliente1.setpaisBrasil(true);

//	Métodos Cliente 1
//		cliente1.separarNomes(true);
//		cliente1.descontoestudante(0.15);
//		cliente1.brindecopa("chapeu");
//		cliente1.clientePedir(30);
		
// Cliente 2
//		cliente2.setnomeUltimoNome("Heloisa Santos Fernandes");
//		cliente2.setPrecoFinal(20.0);
//		cliente2.setPedidos(2);
//		cliente2.setEstudante(false);
//		cliente2.setpaisBrasil(false);
		
//	Métodos Cliente 2
//		cliente2.separarNomes(true);
//		cliente2.descontoestudante(0.30);
//		cliente2.brindecopa("apito");
//		cliente2.clientePedir(3);

// Visualizar todos os dados de um cliente
		cliente1.visualizar();
}
}