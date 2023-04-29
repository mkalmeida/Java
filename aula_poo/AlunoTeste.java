package aula_poo;

public class AlunoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Fernanda");
		
		System.out.println(aluno1.getNome());
		
		aluno1.setIdade(500);
		
		System.out.println(aluno1.getIdade());
		
	}

}
