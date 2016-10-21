package entity;

import java.util.Date;

import enumerate.Especialidade;

public class Terapia {
	private Especialidade tipoTerapia;
	private Date duracaoEstimada;
	private Date duracaoReal;
	private Funcionario funcionario;
	private Paciente paciente;

	private Terapia(Especialidade tipoTerapia, Date duracaoEstimada, Date duracaoReal, Funcionario funcionario,
			Paciente paciente) {
		this.tipoTerapia = tipoTerapia;
		this.duracaoEstimada = duracaoEstimada;
		this.duracaoReal = duracaoReal;
		this.funcionario = funcionario;
		this.paciente = paciente;
	}

	public static Terapia nova(Especialidade tipoTerapia, Date duracaoEstimada, Date duracaoReal, Funcionario funcionario,
			Paciente paciente) {
		return new Terapia(tipoTerapia, duracaoReal, duracaoReal, funcionario, paciente);
	}

	public Especialidade getTipoTerapia() {
		return tipoTerapia;
	}

	public void setTipoTerapia(Especialidade tipoTerapia) {
		this.tipoTerapia = tipoTerapia;
	}

	public Date getDuracaoEstimada() {
		return duracaoEstimada;
	}

	public void setDuracaoEstimada(Date duracaoEstimada) {
		this.duracaoEstimada = duracaoEstimada;
	}

	public Date getDuracaoReal() {
		return duracaoReal;
	}

	public void setDuracaoReal(Date duracaoReal) {
		this.duracaoReal = duracaoReal;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}
