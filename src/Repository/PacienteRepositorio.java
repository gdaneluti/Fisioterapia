package Repository;

import java.util.ArrayList;
import java.util.List;

import Specification.EspecificacaoValidaFuncionarioExisteNoRepositorio;
import Specification.EspecificacaoValidaPacienteExisteNoRepositorio;
import entity.Paciente;

public class PacienteRepositorio implements RepositorioGenerico<Paciente> {

	private static List<Paciente> pacientes = new ArrayList<Paciente>();

	public static List<Paciente> getPacientes() {
		return pacientes;
	}

	public static void setPacientes(List<Paciente> pacientes) {
		PacienteRepositorio.pacientes = pacientes;
	}

	@Override
	public List<Paciente> select(Paciente t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Paciente selectByCpf(String cpf) {
		for (Paciente itemPaciente : pacientes) {
			if (cpf.equals(itemPaciente.getCpf())) {
				return itemPaciente;
			}
		}
		return null;
	}

	@Override
	public Boolean insert(Paciente paciente) {
		EspecificacaoValidaPacienteExisteNoRepositorio validaPacienteExisteNoRepositorio = new EspecificacaoValidaPacienteExisteNoRepositorio();
		if (!validaPacienteExisteNoRepositorio.VerificarPacienteExistenteNoRepositorioPorCrf(paciente,
				pacientes)) {
			pacientes.add(paciente);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void delete(Paciente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Paciente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public PacienteRepositorio() {
		// TODO Auto-generated constructor stub
	}

}
