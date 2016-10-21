package entity;

public class Funcionario {
	
	private String nome;
	private String especialidade;
	private String crf;

	private Funcionario(String nome, String especialidade, String crf) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.setCrf(crf);
	}

	public static Funcionario novo(String nome, String especialidade, String crf) {
		return new Funcionario(nome, especialidade, crf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getCrf() {
		return crf;
	}

	public void setCrf(String crf) {
		this.crf = crf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crf == null) ? 0 : crf.hashCode());
		result = prime * result + ((especialidade == null) ? 0 : especialidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (crf == null) {
			if (other.crf != null)
				return false;
		} else if (!crf.equals(other.crf))
			return false;
		if (especialidade != other.especialidade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.nome + " - " + this.especialidade;
	}
}
