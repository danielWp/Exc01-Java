package poo.sca;

import java.util.ArrayList;
import java.util.Iterator;

public class Turma {
	
	private String horario;
	private int numero;
	private String periodo;
	ArrayList<Professor> professores = new ArrayList<Professor>();
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	Disciplina disciplina;
	
	public Turma(String horario, Disciplina disciplina, int numero, String periodo) {
		super();
		this.horario = horario;
		this.disciplina = disciplina;
		this.numero = numero;
		this.periodo = periodo;
	}
	
	public Turma(){
		
	}
	
	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public void addProfessor(Professor professor){
		professores.add(professor);
	}
	
	public Iterator<Professor> getProfessoresIterator(){
		Iterator<Professor> iterator = professores.iterator();
		return iterator;
	}
	
	public Iterator<Curso> getCursosIterator(){
		Iterator<Curso> iterator = cursos.iterator();
		return iterator;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public String toString(){
		String aux = "";
		return aux+"[Turma] \nhorario: "+horario+"\nnumero: "+numero+" periodo: "+periodo+"\nDisciplina: "+this.disciplina.getNome();
	}

}
