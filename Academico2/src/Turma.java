
public class Turma {
	private String codigo;
	private String professor;
	private String disciplina;
	
	
	public String getCodigo() {
		return codigo;
	}
	@Override
	public String toString() {
		return "Turma [codigo=" + codigo + ", professor=" + professor + ", disciplina=" + disciplina + "]";
	}
	public Turma(String codigo, String professor, String disciplina) {
		super();
		this.codigo = codigo;
		this.professor = professor;
		this.disciplina = disciplina;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	

}
