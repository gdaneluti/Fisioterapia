package entity;

public class Periodo {

	private Data inicio;
	private Data fim;

	public Periodo(Data inicio, Data fim) {
		super();
		this.inicio = inicio;
		this.fim = fim;
	}

	public Data getInicio() {
		return inicio;
	}

	public void setInicio(Data inicio) {
		this.inicio = inicio;
	}

	public Data getFim() {
		return fim;
	}

	public void setFim(Data fim) {
		this.fim = fim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fim == null) ? 0 : fim.hashCode());
		result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
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
		Periodo other = (Periodo) obj;
		if (fim == null) {
			if (other.fim != null)
				return false;
		} else if (!fim.equals(other.fim))
			return false;
		if (inicio == null) {
			if (other.inicio != null)
				return false;
		} else if (!inicio.equals(other.inicio))
			return false;
		return true;
	}

}
