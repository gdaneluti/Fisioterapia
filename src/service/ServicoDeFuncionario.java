package service;

import Repository.FuncionarioRepository;
import entity.Funcionario;
import enumerate.Especialidade;
import factory.FabricaFuncionario;

public class ServicoDeFuncionario {
	private FuncionarioRepository funcionarioRepositorio = new FuncionarioRepository();

	public ServicoDeFuncionario() {

	}

	public Boolean Criar(String nome, String especialidade, String crf) {
		Funcionario funcionario = FabricaFuncionario.nova().novo(nome, especialidade, crf);
		return funcionarioRepositorio.insert(funcionario);
	}

	public FuncionarioRepository getFuncionarioRepositorio() {
		return funcionarioRepositorio;
	}

	public void setFuncionarioRepositorio(FuncionarioRepository funcionarioRepositorio) {
		this.funcionarioRepositorio = funcionarioRepositorio;
	}
	
	public boolean loginFuncionario (String crf) {
		return funcionarioRepositorio.selectByCrf(crf);
	}
	
	public Funcionario procurarFuncionarioByCrf(String crf){
		return funcionarioRepositorio.selectByCrfReturnFuncionario(crf);
	}
	
	
}
