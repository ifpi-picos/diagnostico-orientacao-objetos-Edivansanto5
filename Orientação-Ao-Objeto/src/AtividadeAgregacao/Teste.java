package AtividadeAgregacao;

public class Teste {
	
	public static void main(String[] args) {
		Curso ads = new Curso("ADS");
		Curso mat = new Curso("MATEMÁTICA");
		
		Professor mauro = new Professor("mauro");
		Professor nayara = new Professor("nayara");
		
		ads.adcionarDisciplina(new Disciplina("web",78,mauro));
		System.out.println(ads.getNome());
		
		
		
	}

}
