package factory;

import entity.AvaliacaoDoFuncionarioPeloCliente;

public class FabricaAvaliacaoDoFuncionarioParaPaciente {
	
	public AvaliacaoDoFuncionarioPeloCliente criarNovaAvaliacaoDoFuncionarioPeloCliente(String nota, String comentarios){
		
		AvaliacaoDoFuncionarioPeloCliente avaliacaoDoFuncionarioPeloCliente = new AvaliacaoDoFuncionarioPeloCliente(nota, comentarios);
		return avaliacaoDoFuncionarioPeloCliente;
	}
}
