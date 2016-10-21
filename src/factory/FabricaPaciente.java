package factory;

import entity.Paciente;

public class FabricaPaciente {

	private FabricaPaciente(){
		
	}
	
	public static FabricaPaciente novaFabricaPaciente() {
		FabricaPaciente fabricaPaciente = new FabricaPaciente();
		return fabricaPaciente;
	}
	
	public Paciente  CriaPaciente(String nome, String cpf){
		Paciente paciente = Paciente.novoPaciente(nome,cpf);
		return paciente;
	}
}
