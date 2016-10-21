package factory;

import aggregate.AgendaPaciente;
import entity.Agenda;
import entity.Paciente;

public class FabricaAgendaPaciente {

	private FabricaAgendaPaciente() {
		// TODO Auto-generated constructor stub
	}

	public static FabricaAgendaPaciente nova(){
		return new FabricaAgendaPaciente();
	}
	
	public AgendaPaciente novaAgenda(Agenda agenda, Paciente paciente){
		return AgendaPaciente.nova(agenda, paciente);
	}
}
