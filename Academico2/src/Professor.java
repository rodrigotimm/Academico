
public class Professor {
	private String nome;
	private String matricula;
	private String titulacao;
	private String CPF;

	
	
	
	
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", matricula=" + matricula + ", titula��o=" + titulacao + ", CPF=" + CPF
				+ "]";
	}
	public Professor(String nome, String matricula, String titula��o, String cPF) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.titulacao = titula��o;
		CPF = cPF;
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTitula��o() {
		return titulacao;
	}
	public void setTitula��o(String titula��o) {
		this.titulacao = titula��o;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	

}
