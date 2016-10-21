package service;

import java.util.ArrayList;
import java.util.List;

import Repository.AgendaPacienteRepositorio;
import Repository.PacienteRepositorio;
import aggregate.AgendaPaciente;
import entity.Agenda;
import entity.Paciente;
import factory.FabricaPaciente;

public class ServicoPaciente {

	private PacienteRepositorio pacienteRepositorio = new PacienteRepositorio();

	public ServicoPaciente() {

	}

	public Boolean novoPaciente(String nome, String cpf) {
		PacienteRepositorio pacienteRepositorio = new PacienteRepositorio();
		Paciente paciente = FabricaPaciente.novaFabricaPaciente().CriaPaciente(nome, cpf);
		return pacienteRepositorio.insert(paciente);
	}

	public Paciente retornaPaciente(String nome, String cpf) {
		return FabricaPaciente.novaFabricaPaciente().CriaPaciente(nome, cpf);
	}

	public void inserePaciente(Paciente paciente) {
		pacienteRepositorio.insert(paciente);
	}

	public Paciente solicitarLoginPaciente(String cpf) {
		return pacienteRepositorio.selectByCpf(cpf);
	}

	public PacienteRepositorio getPacienteRepositorio() {
		return pacienteRepositorio;
	}

	public void setPacienteRepositorio(PacienteRepositorio pacienteRepositorio) {
		this.pacienteRepositorio = pacienteRepositorio;
	}

	public List<Agenda> retornaAgendasPaciente(String cpf) {
		List<Agenda> retorno = new ArrayList<Agenda>();

		for (AgendaPaciente ap : AgendaPacienteRepositorio.getAgendas()) {
			if (ap.getPaciente().getCpf().equals(cpf)) {
				retorno.add(ap.getAgenda());
			}
		}
		return null;
	}

}
