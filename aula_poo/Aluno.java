package aula_poo;

public class Aluno {
	
	private String nome;
	private int idade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		
		if(idade>0 && idade<130) {
			this.idade = idade;
			System.out.println("cadastro realizado com sucesso");
		} else {
			System.out.println("erro, a idade digitada não é permitida");
		}
		
	}
	
	public int getIdade() {
		return idade;
	}
}
