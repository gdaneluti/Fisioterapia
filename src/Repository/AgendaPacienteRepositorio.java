package Repository;

import java.util.ArrayList;
import java.util.List;

import aggregate.AgendaPaciente;

public class AgendaPacienteRepositorio implements RepositorioGenerico<AgendaPaciente> {

	private static List<AgendaPaciente> agendas = new ArrayList<AgendaPaciente>();

	@Override
	public List<AgendaPaciente> select(AgendaPaciente agendaPaciente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insert(AgendaPaciente agendaPaciente) {
		agendas.add(agendaPaciente);
		return true;
	}

	@Override
	public void delete(AgendaPaciente agendaPaciente) {
		agendas.remove(agendaPaciente);

	}

	public static List<AgendaPaciente> getAgendas() {
		return agendas;
	}

	public static void setAgendas(List<AgendaPaciente> agendas) {
		AgendaPacienteRepositorio.agendas = agendas;
	}

	@Override
	public List<AgendaPaciente> findAll() {
		return agendas;
	}

}
