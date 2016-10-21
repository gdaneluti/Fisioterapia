package factory;

import java.util.List;

import entity.Agenda;
import entity.Funcionario;
import entity.Periodo;

public class FabricaAgenda {

	private FabricaAgenda() {
		// TODO Auto-generated constructor stub
	}
	
	public static FabricaAgenda nova(){
		return new FabricaAgenda();
	}

	public Agenda novaAgenda(Funcionario funcionario, List<Periodo> periodos){
		return Agenda.nova(funcionario, periodos);
	}
}
