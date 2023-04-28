package POOAtividades;

public class Funcionario {
	
	private String nome, email, setor;
	private int telefone;
	private double salario;
	
	public Funcionario (String nome, String email, String setor, int telefone, double salario) {
		this.nome = nome;
		this.email = email;
		this.setor = setor;
		this.telefone = telefone;
		this.salario = salario;
	}
	
	public void visualizar() {
		System.out.println("O nome do é: " +getNome());
		System.out.println("O email é: " +getEmail());
		System.out.println("O setor é: " +getSetor());
		System.out.println("O telefone é: " +getTelefone());
		System.out.println("O salario é: " +getSalario());
	}
	
	
// Get e Set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
