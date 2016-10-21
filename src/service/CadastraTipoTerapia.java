package service;

import java.util.Date;

import entity.Funcionario;
import entity.Paciente;
import entity.Terapia;
import enumerate.Especialidade;
import factory.FabricaTerapia;

public class CadastraTipoTerapia {

	public CadastraTipoTerapia() {

	}

	public Terapia solicitarCriacaoTerapia(Especialidade tipoTerapia, Date duracaoEstimada, Date duracaoReal,
			Funcionario funcionario, Paciente paciente) {
		return FabricaTerapia.nova().nova(tipoTerapia, duracaoEstimada, duracaoReal, funcionario, paciente);
	}
}
