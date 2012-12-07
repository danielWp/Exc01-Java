package poo.sca;

public class Professor {
	private String nome;
	private int matricula; 

	public Professor(){
		
	}
	
	public Professor(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String toString(){
		String auxiliar="";
		return auxiliar+"[Professor]\nNome: "+nome+"\n Matricula: "+matricula;
	}
	
}
