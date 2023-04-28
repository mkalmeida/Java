package POOAtividades;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("michaella", "michaella@gmail.com", "Desenvolvimento em Java", 973217364, 2000.00);
		Funcionario f2 = new Funcionario("heloisa", "heloisa@gmail.com", "Desenvolvimento em Python", 977776543, 3200.00);
				
		
//		f1.visualizar();
				
		f2.setEmail("heloisa2@gmail.com");
		f2.setSalario(5000.00);
		
		f2.visualizar();

	}

}
