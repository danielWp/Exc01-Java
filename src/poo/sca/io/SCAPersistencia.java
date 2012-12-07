package poo.sca.io;

import java.util.ArrayList;

import poo.sca.Curso;
import poo.sca.Disciplina;
import poo.sca.Professor;
import poo.sca.Turma;

public interface SCAPersistencia {
	public void salvarDisciplina(Disciplina disciplina);
	public ArrayList<Disciplina> recuperarDisciplina();
	
	public void salvarProfessor(Professor professor);
	public ArrayList<Professor> recuperarProfessores();
	
	public void salvarCurso(Curso curso);
	public ArrayList<Curso> recuperarCursos();
	
	public void salvarTurma(Turma turma);
	public ArrayList<Turma> recuperarTurma();
	public void removerTurma(Turma turma);
}
