package AtividadeAgregacao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private List<Disciplina> disciplinas;
	// inserir a lista
	
	public Curso(String nome) {
		this.nome = nome;
		this.disciplinas = new ArrayList<Disciplina>();
	}
//
	public void adcionarDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	public void removeDisciplina(Disciplina disciplina) {
		this.disciplinas.remove(disciplina);
	}
	public List<Disciplina> getDisciplinas(){
		return disciplinas;
		
		
	}
	public String getNome() {
		return nome;
	}
	
	
	
}
