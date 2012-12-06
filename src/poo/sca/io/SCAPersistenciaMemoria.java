package poo.sca.io;

import java.util.ArrayList;

import poo.sca.Curso;
import poo.sca.Disciplina;
import poo.sca.Professor;
import poo.sca.Turma;

public class SCAPersistenciaMemoria implements SCAPersistencia {
	
	ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	ArrayList<Professor> professores = new ArrayList<Professor>();
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	ArrayList<Turma> turmas = new ArrayList<Turma>();

	@Override
	public void salvarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	@Override
	public ArrayList<Disciplina> recuperarDisciplina() {
		return disciplinas;
	}

	@Override
	public void salvarProfessor(Professor professor) {
		professores.add(professor);
	}

	@Override
	public ArrayList<Professor> recuperarProfessores() {
		return professores;
	}

	@Override
	public void salvarCurso(Curso curso) {
		cursos.add(curso);
	}

	@Override
	public ArrayList<Curso> recuperarCursos() {
		return cursos;
	}

	@Override
	public void salvarTurma(Turma turma) {
		turmas.add(turma);
	}

	@Override
	public ArrayList<Turma> recuperarTurma() {
		return turmas;
	}

	@Override
	public void removerTurma(Turma turma) {
		turmas.remove(turma);
	}
	
}
