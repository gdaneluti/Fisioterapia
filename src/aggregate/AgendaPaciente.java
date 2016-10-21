package aggregate;

import entity.Agenda;
import entity.Paciente;

public class AgendaPaciente {

	private Agenda agenda;
	private Paciente paciente;
	
	private AgendaPaciente(Agenda agenda, Paciente paciente) {
		this.setAgenda(agenda);
		this.setPaciente(paciente);
	}

	public static AgendaPaciente nova(Agenda agenda, Paciente paciente) {
		return new AgendaPaciente(agenda, paciente);
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
