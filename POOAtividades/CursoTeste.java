package POOAtividades;

public class CursoTeste {

	public static void main(String[] args) {

		Curso cursojava = new Curso("Curso de Java Afro Tech Pretas", "Michelle", 10, 80.00, true);
		
		cursojava.setNomecurso("Curso Python");
		cursojava.setAulaaovivo(false);
		
		cursojava.visualizar();

	}

}
