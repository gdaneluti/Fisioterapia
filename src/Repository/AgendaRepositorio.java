package Repository;

import java.util.ArrayList;
import java.util.List;

import entity.Agenda;

public class AgendaRepositorio implements RepositorioGenerico<Agenda> {
	private static List<Agenda> agendas = new ArrayList<Agenda>();

	@Override
	public List<Agenda> select(Agenda t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insert(Agenda t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Agenda t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Agenda> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Agenda> getAgendas() {
		return agendas;
	}

	public static void setAgendas(List<Agenda> agendas) {
		AgendaRepositorio.agendas = agendas;
	}

}
