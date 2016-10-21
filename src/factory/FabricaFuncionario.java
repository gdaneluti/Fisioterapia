package factory;

import entity.Funcionario;
import enumerate.Especialidade;

public class FabricaFuncionario {

	private FabricaFuncionario() {

	}

	public static FabricaFuncionario nova() {
		return new FabricaFuncionario();
	}

	public Funcionario novo(String nome, String especialidade, String crf) {
		return Funcionario.novo(nome, especialidade, crf);
	}

}
