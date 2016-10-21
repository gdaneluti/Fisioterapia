package factory;

import java.util.Date;

import entity.Funcionario;
import entity.Paciente;
import entity.Terapia;
import enumerate.Especialidade;

public class FabricaTerapia {

	private FabricaTerapia() {

	}

	public static FabricaTerapia nova(){
		return new FabricaTerapia();
	}
	
	public Terapia nova(Especialidade tipoTerapia, Date duracaoEstimada, Date duracaoReal,
			Funcionario funcionario, Paciente paciente) {
		return Terapia.nova(tipoTerapia, duracaoEstimada, duracaoReal, funcionario, paciente);
	}
}