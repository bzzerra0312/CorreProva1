package prova;
import java.time.LocalDate;

public class Cliente {
	//DN= Data de nascimento, NT= Número de telefone
	private String nome;
	private String CPF;
	private LocalDate DN;
	private String NT;
	private String cidade;
	private String UF;
	
	//Construtor
	public Cliente(String nome, String cPF, LocalDate dN, String nT, String cidade, String uF) {
		this.nome = nome;
		CPF = cPF;
		DN = dN;
		NT = nT;
		this.cidade = cidade;
		UF = uF;
	//Getters n' Setters	
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public LocalDate getDN() {
		return DN;
	}

	public void setDN(LocalDate dN) {
		DN = dN;
	}

	public String getNT() {
		return NT;
	}

	public void setNT(String nT) {
		NT = nT;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}
	
	

}
