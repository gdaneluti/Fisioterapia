package factory;


import entity.AvaliacaoDoPacientePeloFuncionario;

public class FabricaAvaliacaoDoPacienteParaFuncionario {
	
	public AvaliacaoDoPacientePeloFuncionario criarNovaAvaliacaoDoPacientePeloFuncionario(String diagnostico){
		
		AvaliacaoDoPacientePeloFuncionario AvaliacaoDoPacientePeloFuncionario = new AvaliacaoDoPacientePeloFuncionario(diagnostico);
		return AvaliacaoDoPacientePeloFuncionario;
	}
}
