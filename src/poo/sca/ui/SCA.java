package poo.sca.ui;

import java.util.Iterator;

import javax.swing.JOptionPane;

import poo.sca.Curso;
import poo.sca.Disciplina;
import poo.sca.Professor;
import poo.sca.SCAFacade;
import poo.sca.Turma;

public class SCA {
	static String aux="";
	static String mensagem="";
	static SCAFacade facade = new SCAFacade();
	
	
	public static String lerEntradaUsuario(String mensagem){
		aux = JOptionPane.showInputDialog(mensagem);
		return aux;
	}
	
	public static String exibirMenu(){
		String mensagem = "			-Bem vindo controle de gerenciamento-\n Qual categoria você deseja acessar? \n 1-Disciplina \n 2-Professores \n 3-Cursos \n 4-Turmas \n 0-Sair";
		lerEntradaUsuario(mensagem);
		return aux;
	}
	
	public static String menuDisciplina(){
		String mensagem ="			-Disciplinas \n Qual categoria você deseja acessar? \n 1-Criar Disciplina \n 2-Mostrar Disciplinas \n 0-Voltar ao Menu Principal";
		aux = lerEntradaUsuario(mensagem);
		//parse
		
		return aux;
	}
	
	public static String menuProfessor(){
		String mensagem ="			-Professores \n Qual categoria você deseja acessar? \n 1-Criar Professor \n 2-Mostrar Professores \n 0-Voltar ao Menu Principal";
		aux =lerEntradaUsuario(mensagem);
		return aux;
	}
	
	public static String menuCurso(){
		String mensagem ="			-Cursos \n Qual categoria você deseja acessar? \n 1-Criar Curso \n 2-Mostrar Curso \n 0-Voltar ao Menu Principal";
		aux = lerEntradaUsuario(mensagem);
		return aux;
	}
	
	public static String menuTurma(){
		String mensagem = "			-Turmas \n Qual categoria você deseja acessar? \n 1-Criar Turma \n 2-Mostrar Turmas \n 3-Remover turma \n 4-Ver uma Turma especifica \n 0-Voltar ao Menu Principal";
		aux =lerEntradaUsuario(mensagem);
		return aux;
	}
	
	public static void opcaoDisciplina(int opcDisciplina){
		if(opcDisciplina == 0){	}		
		else if(opcDisciplina == 1){
			mensagem = "Informe o nome da disciplina, por favor: ";
			String nome =lerEntradaUsuario(mensagem);
			
			mensagem = "Informe o codigo da disciplina, por favor: ";
			aux =lerEntradaUsuario(mensagem);
			int codigo = Integer.parseInt(aux);
			
			Disciplina disciplina = facade.criarDisciplina(nome, codigo);
			JOptionPane.showMessageDialog(null, "A disciplina ["+disciplina.getNome()+"] foi criada com sucesso!");
			
		}
		else if(opcDisciplina == 2){
			Iterator<Disciplina> iterator = facade.getDisciplinasIterator();
			while (iterator.hasNext()){
				Disciplina disciplina = iterator.next();
				System.out.println(disciplina.toString());
			}
			
		}else{
			JOptionPane.showMessageDialog(null, "Opcao invalida!");
		}
	}

	public static void opcaoProfessor(int opcProfessor){
		if(opcProfessor == 0){	}
		
		else if(opcProfessor == 1){
			mensagem = "Informe o nome do professor(a), por favor: ";
			String nome = lerEntradaUsuario(mensagem);
			
			aux = "Informe a matricula do professor(a), por favor: ";
			aux = lerEntradaUsuario(mensagem);
			int matricula = Integer.parseInt(aux);
			
			Professor professor = facade.criarProfessor(nome, matricula);
			JOptionPane.showMessageDialog(null, "O professor(a) ["+professor.getNome()+"] foi criado(a) com sucesso!");
		}
		else if(opcProfessor == 2){
			Iterator<Professor> iterator = facade.getProfessoresIterator();
			while(iterator.hasNext()){
				Professor professor = iterator.next();
				System.out.println(professor.toString());
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Opcao invalida!");
		}
	}

	public static void opcaoCurso(int opcCurso){
		if(opcCurso == 0){	}
		else if(opcCurso == 1){
			mensagem ="Informe o nome do curso, por favor: ";
			String nome = lerEntradaUsuario(mensagem);
			
			aux ="Informe o codigo do curso, por favor: ";
			aux = lerEntradaUsuario(mensagem);
			int codigo = Integer.parseInt(aux);
			
			Curso curso = facade.criarCurso(nome, codigo);
			JOptionPane.showMessageDialog(null, "O curso ["+curso.getNome()+"] foi criado com sucesso!");
			
		}else if(opcCurso == 2){
			Iterator<Curso> iterator = facade.getCursosIterator();
			while (iterator.hasNext()){
				Curso curso = iterator.next();
				System.out.println(curso.toString());
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Opcao invalida!");
		}
	}
	
	public static void opcaoTurma(int opcTurma){
		if(opcTurma == 0){ }
		else if(opcTurma == 1){
			mensagem = "Informe o horario da turma, por favor: ";
			String horario = lerEntradaUsuario(mensagem)
					;
			mensagem = "Informe o periodo da turma, por favor: ";
			String periodo =lerEntradaUsuario(mensagem);
			
			aux = "Informe o numero da turma, por favor: ";
			aux = lerEntradaUsuario(mensagem);
			int numero = Integer.parseInt(aux);
			
			mensagem = "Informe o codigo da disciplina dessa turma, por favor: ";
			String aux2 = lerEntradaUsuario(mensagem);
			int codigo = Integer.parseInt(aux2);
			
			Disciplina disciplina = facade.getDisciplina(codigo);
			
			Turma turma = facade.criarTurma(horario, disciplina, numero, periodo);
			JOptionPane.showMessageDialog(null, "A turma ["+turma.getNumero()+"] foi criada com sucesso!");
			
		}
		else if(opcTurma== 2){
			Iterator<Turma> iterator = facade.getTurmasIterator();
			while (iterator.hasNext()){
				Turma turma = iterator.next();
			    System.out.println(turma.toString());
			}
		}
		else if(opcTurma== 3){
			mensagem = "Informe o periodo da turma ue desajas remover, por favor: ";
			String periodo =lerEntradaUsuario(mensagem);
			
			mensagem = "A seguir, o codigo da disciplina dessa turma, por favor: ";
			String aux2 = lerEntradaUsuario(mensagem);
			int codDisciplina = Integer.parseInt(aux2);
			
			mensagem ="E por fim, o numero da turma, por favor: ";
			aux = lerEntradaUsuario(mensagem);
			int numero = Integer.parseInt(aux);
			
			Turma t = facade.getTurma(periodo, codDisciplina, numero);
			JOptionPane.showMessageDialog(null,t.toString());
		}
		else if(opcTurma== 4){
			mensagem = "Informe o periodo da turma, por favor: ";
			String periodo = lerEntradaUsuario(mensagem);
			
			mensagem ="Informe o codigo da disciplina dessa turma, por favor: ";
			aux = lerEntradaUsuario(mensagem);
			int codDisciplina = Integer.parseInt(aux);
			
			mensagem = ("Informe o numero da turma, por favor: ");
			String aux2 = lerEntradaUsuario(mensagem);
			int numero = Integer.parseInt(aux2);
			
			facade.removerTurma(periodo, codDisciplina, numero);
		}else{
			JOptionPane.showMessageDialog(null, "Opcao invalida!");
		}
	
	}
	
	public static void main(String args[]){
		
		int opc=-1;
		
		while(opc!= 0){
			aux =exibirMenu();
			opc = Integer.parseInt(aux);
			
			switch(opc){
				case 0:
					break;
					
				case 1:
					aux= menuDisciplina();
					int opcDisciplina = Integer.parseInt(aux);
					opcaoDisciplina(opcDisciplina);
					break;
					
				case 2:
					aux= menuProfessor();
					int opcProfessor = Integer.parseInt(aux);
					opcaoProfessor(opcProfessor);
					break;
					
				case 3:
					aux= menuCurso();
					int opcCurso = Integer.parseInt(aux);
					opcaoCurso(opcCurso);
					break;
					
				case 4:
					aux= menuTurma();
					int opcTurma = Integer.parseInt(aux);
					opcaoTurma(opcTurma);
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opcao invalida!");
					break;
			}
			
		}
		
	}

}
