package poo.sca;

import java.util.Iterator;
import poo.sca.io.SCAPersistenciaMemoria;

public class SCAFacade {
	SCAPersistenciaMemoria persistencia = new SCAPersistenciaMemoria();
	
	
	public Disciplina criarDisciplina(String nome, int codigo){
		Disciplina disciplina = new Disciplina(codigo, nome);
		persistencia.salvarDisciplina(disciplina);
		return disciplina;
	}

	public Iterator<Disciplina> getDisciplinasIterator() {
		Iterator<Disciplina> iterator = persistencia.recuperarDisciplina().iterator();
		return iterator;
	}

	public Disciplina getDisciplina(int codDisciplina){
		for(Disciplina d: persistencia.recuperarDisciplina()){
			if(d.getCodigo() == codDisciplina){
				return d;
			}
		}
		return null;
	}
	
	public Professor criarProfessor(String nome, int matricula){
		Professor professor = new Professor(nome, matricula);
		persistencia.salvarProfessor(professor);
		return professor;
	}
	public Iterator<Professor> getProfessoresIterator(){
		Iterator<Professor> iterator = persistencia.recuperarProfessores().iterator();
		return iterator;
	}
	
	public Curso criarCurso(String nome, int codigo){
		Curso curso = new Curso(codigo, nome);
		persistencia.salvarCurso(curso);
		return curso;
	}
	public Iterator<Curso> getCursosIterator(){
		Iterator<Curso> iterator = persistencia.recuperarCursos().iterator();
		return iterator;
	}
	
	public Turma criarTurma(String horario, Disciplina disciplina, int numero, String periodo){
		Turma turma = new Turma(horario, disciplina, numero, periodo);
		persistencia.salvarTurma(turma);
		return turma;
	}
	
	public Iterator<Turma> getTurmasIterator(){
		Iterator<Turma> iterator = persistencia.recuperarTurma().iterator();
		return iterator;
	}
	
	public Turma getTurma(String periodo, int codDisciplina, int numero){
		for(Turma t: persistencia.recuperarTurma()){
			if(t.getPeriodo().equals(periodo) &&  t.getDisciplina().getCodigo() == codDisciplina && t.getNumero() == numero){
				return t;
			}
		}
		return null;
	}
	
	public Turma removerTurma(String periodo, int codDisciplina, int numero){
		Turma turma = this.getTurma(periodo, codDisciplina, numero);
		persistencia.removerTurma(turma);
		return turma;
	}
	
}