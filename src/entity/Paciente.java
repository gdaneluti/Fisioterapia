package entity;

public class Paciente {
	private String nome;
	private String cpf;

	private Paciente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public static Paciente novoPaciente(String nome, String cpf) {
		Paciente paciente = new Paciente(nome, cpf);
		return paciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
