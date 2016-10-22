package Specification;

import java.util.List;

import entity.Funcionario;

public class EspecificacaoValidaFuncionarioExisteNoRepositorio {

	public EspecificacaoValidaFuncionarioExisteNoRepositorio() {

	}

	public Boolean VerificarFuncionarioExistenteNoRepositorioPorCrf(Funcionario funcionario,
			List<Funcionario> funcionarios) {
		for (Funcionario funcionario_ : funcionarios) {
			if (funcionario.getCrf().equals(funcionario_.getCrf())) {
				return true;
			} 
		}
		return false;
	}
}
