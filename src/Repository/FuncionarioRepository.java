package Repository;

import java.util.ArrayList;
import java.util.List;

import Specification.EspecificacaoValidaFuncionarioExisteNoRepositorio;
import entity.Funcionario;

public class FuncionarioRepository implements RepositorioGenerico<Funcionario> {

	private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public FuncionarioRepository() {
		
	}

	@Override
	public List<Funcionario> select(Funcionario t) {
		List<Funcionario> listaResposta = new ArrayList<Funcionario>();
		for (Funcionario itemFuncionario : funcionarios) {
			if (t.getCrf().equals(itemFuncionario.getCrf())) {
				listaResposta.add(itemFuncionario);
			}
		}
		return listaResposta;
	}
	
	public boolean selectByCrf(String crf) {
		for (Funcionario itemFuncionario : funcionarios) {
			if (crf.equals(itemFuncionario.getCrf())) {
				return true;
			}
		}
		return false;
	}
	
	public Funcionario selectByCrfReturnFuncionario(String crf) {
		for (Funcionario itemFuncionario : funcionarios) {
			if (crf.equals(itemFuncionario.getCrf())) {
				return itemFuncionario;
			}
		}
		return null;
	}

	@Override
	public Boolean insert(Funcionario funcionario) {
		EspecificacaoValidaFuncionarioExisteNoRepositorio validaFuncionarioExisteNoRepositorio = new EspecificacaoValidaFuncionarioExisteNoRepositorio();
		if (!validaFuncionarioExisteNoRepositorio.VerificarFuncionarioExistenteNoRepositorioPorCrf(funcionario,
				funcionarios)) {
			funcionarios.add(funcionario);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void delete(Funcionario t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Funcionario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		FuncionarioRepository.funcionarios = funcionarios;
	}
}
