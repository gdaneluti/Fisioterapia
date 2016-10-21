package service;

import java.util.List;

import Repository.AgendaPacienteRepositorio;
import aggregate.AgendaPaciente;
import entity.Agenda;
import entity.Funcionario;
import entity.Paciente;
import entity.Periodo;
import factory.FabricaAgendaPaciente;
import util.CalendarioUtil;

public class ServicoAgendaPaciente {

	AgendaPacienteRepositorio agendaPacienteRepositorio = new AgendaPacienteRepositorio();

	public ServicoAgendaPaciente() {
		// TODO Auto-generated constructor stub
	}

	public Boolean Criar(Agenda agenda, Paciente paciente) {
		return agendaPacienteRepositorio.insert(FabricaAgendaPaciente.nova().novaAgenda(agenda, paciente));
	}

	public List<AgendaPaciente> getAgendaPaciente() {
		return agendaPacienteRepositorio.findAll();
	}

	public Agenda getHorariosDisponiveisByEspecialidade(Funcionario funcionario) {
		Agenda agendaDisponivel = CalendarioUtil.criarAgenda(funcionario);
		for (AgendaPaciente itemAgendaPaciente : AgendaPacienteRepositorio.getAgendas()) {
			for (Periodo itemPeriodo : itemAgendaPaciente.getAgenda().getPeriodos()) {
				if (itemAgendaPaciente.getAgenda().getFuncionario().equals(funcionario)) {
					agendaDisponivel.getPeriodos().remove(itemPeriodo);
				}
			}
		}
		return agendaDisponivel;
	}
	
	public void removerAgendaPaciente(AgendaPaciente agendaPaciente){
		agendaPacienteRepositorio.delete(agendaPaciente);
	}

}
