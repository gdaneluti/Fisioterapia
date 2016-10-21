package service;

import java.util.ArrayList;
import java.util.List;

import Repository.FuncionarioRepository;
import Repository.PacienteRepositorio;
import aggregate.AgendaPaciente;
import entity.Agenda;
import entity.Data;
import entity.Funcionario;
import entity.Paciente;
import entity.Periodo;
import enumerate.Especialidade;

public class ServicoFaixada {

	private ServicoPaciente servicoPaciente = new ServicoPaciente();
	private ServicoDeFuncionario servicoFuncionario = new ServicoDeFuncionario();
	private ServicoAgendaPaciente servicoAgendaPaciente = new ServicoAgendaPaciente();

	public ServicoFaixada() {
		// TODO Auto-generated constructor stub
	}

	public Boolean cadastrarPaciente(String nome, String cpf) {
		return servicoPaciente.novoPaciente(nome, cpf);
	}

	public Boolean cadastrarFuncionario(String nome, String especialidade, String crf) {
		return servicoFuncionario.Criar(nome, especialidade, crf);
	}

	public List<Funcionario> getFuncionarios() {
		return FuncionarioRepository.getFuncionarios();
	}

	public List<Paciente> getPacientes() {
		return PacienteRepositorio.getPacientes();
	}

	public List<String> getEspecialidades() {
		List<String> especialidades = new ArrayList<String>();
		for (Especialidade especialidade : Especialidade.values()) {
			especialidades.add(especialidade.toString());
		}
		return especialidades;
	}
	
	public List<AgendaPaciente> getAgendaPaciente(){
		return servicoAgendaPaciente.getAgendaPaciente();
	}

	public Agenda IniciarAgendamento(Funcionario funcionario) {
		return servicoAgendaPaciente.getHorariosDisponiveisByEspecialidade(funcionario);
	}

	public Agenda Agendar(Data dataInicial, Data dataFinal, Funcionario funcionario) {
		Periodo periodo = new Periodo(dataInicial, dataFinal);
		List<Periodo> periodos = new ArrayList<Periodo>();
		periodos.add(periodo);
		return Agenda.nova(funcionario, periodos);
	}

	public Boolean AgregarAgendaPaciente(Agenda agenda, Paciente paciente) {
		return servicoAgendaPaciente.Criar(agenda, paciente);
	}

	public boolean solicitarLoginFuncionario(String crf) {
		return servicoFuncionario.loginFuncionario(crf);
	}

	public Paciente solicitarLoginPaciente(String cpf) {
		return servicoPaciente.solicitarLoginPaciente(cpf);
	}

	public Funcionario solicitarFuncionarioByCrf(String crf) {
		return servicoFuncionario.procurarFuncionarioByCrf(crf);
	}

	public void solicitarDeleteAgendaPaciente(AgendaPaciente agendaPaciente) {
		servicoAgendaPaciente.removerAgendaPaciente(agendaPaciente);
	}

}
