package POOAtividades;

public class Curso {

		private String nomecurso, professor;
		int duracao;
		double preco;
		boolean aulaaovivo;
		
		public Curso (String nomecurso, String professor, int duracao, double preco, boolean aulaaovivo) {
			this.nomecurso = nomecurso;
			this.professor = professor;
			this.duracao = duracao;
			this.preco = preco;
			this.aulaaovivo = aulaaovivo;
		}
		
		void visualizar() {
			System.out.println("O nome do curso é: " +getNomecurso());
			System.out.println("O prodessor é: " +getProfessor());
			System.out.println("A duração é: " +getDuracao());
			System.out.println("O preço é: " +getPreco());
			System.out.println("Tem aulas ao vivo? " +isAulaaovivo());
		}

		public String getNomecurso() {
			return nomecurso;
		}

		public void setNomecurso(String nomecurso) {
			this.nomecurso = nomecurso;
		}

		public String getProfessor() {
			return professor;
		}

		public void setProfessor(String professor) {
			this.professor = professor;
		}

		public int getDuracao() {
			return duracao;
		}

		public void setDuracao(int duracao) {
			this.duracao = duracao;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public boolean isAulaaovivo() {
			return aulaaovivo;
		}

		public void setAulaaovivo(boolean aulaaovivo) {
			this.aulaaovivo = aulaaovivo;
		}
		
		
}
