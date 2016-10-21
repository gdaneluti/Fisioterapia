package util;

import java.util.ArrayList;
import java.util.List;

import aggregate.AgendaPaciente;
import entity.Agenda;
import entity.Data;
import entity.Funcionario;
import entity.Periodo;

public class CalendarioUtil {

	public CalendarioUtil() {
		// TODO Auto-generated constructor stub
	}

	public static Agenda criarAgenda(Funcionario funcionario){
		List<Periodo> periodos = new ArrayList<Periodo>();;
		for (int i = 8; i < 20; i++){
			Data dataInicio = Data.nova(i, 0);
			Data dataFim = Data.nova(i + 1, 0);
			periodos.add(new Periodo(dataInicio, dataFim));
		}
		Agenda agenda = Agenda.nova(funcionario, periodos);
		return agenda;
	}
	
	public Agenda getHorariosDisponiveis(Funcionario funcionario, AgendaPaciente agendaPaciente){
		Agenda agendaDisponivel = criarAgenda(funcionario);
		for (Periodo itemPeriodo : agendaPaciente.getAgenda().getPeriodos()){
			agendaDisponivel.getPeriodos().remove(itemPeriodo);
		}
		return agendaDisponivel;
	}
}
