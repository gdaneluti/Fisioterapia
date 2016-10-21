package service;

import java.util.List;

import entity.Agenda;
import entity.Funcionario;
import entity.Periodo;
import factory.FabricaAgenda;

public class ServicoAgenda {

	public ServicoAgenda() {
		// TODO Auto-generated constructor stub
	}
	
	public Agenda nova(Funcionario funcionario, List<Periodo> periodos){
		return FabricaAgenda.nova().novaAgenda(funcionario, periodos);
	}

}
