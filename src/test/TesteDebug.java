package test;

import java.util.ArrayList;
import java.util.List;

import Repository.AgendaPacienteRepositorio;
import Repository.FuncionarioRepository;
import aggregate.AgendaPaciente;
import entity.Agenda;
import entity.Data;
import entity.Funcionario;
import entity.Paciente;
import entity.Periodo;
import service.ServicoDeFuncionario;
import service.ServicoFachada;
import view.Fisioterapia;

public class TesteDebug {

	public TesteDebug() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Fisioterapia fisioterapia = new Fisioterapia();
		fisioterapia.main(args);
		
		//testUpdateAgendaPaciente();

		// testarCriacaoFuncio nario();
		// vizualizarAgenda();
		// getEspecialidades();
		// BuscarHorariosLivres();
		// TesteSelectFuncionario1();
		// TestarStatic();
	}

	// public static void getEspecialidades() {
	// ServicoFaixada servicoFaixada = new ServicoFaixada();
	// List<String> teste = servicoFaixada.getEspecialidades();
	// }

	/*
	 * public static void BuscarHorariosLivres() { ServicoFaixada servicoFaixada
	 * = new ServicoFaixada();
	 * 
	 * // Simula a cria��o de um paciente
	 * servicoFaixada.cadastrarPaciente("GABRIEL", "402.502.698-80"); // Simula
	 * o cadastro de um funcionario
	 * servicoFaixada.cadastrarFuncionario("GUSTAVO", "ACUPUNTURA", "1234");
	 * Agenda agenda =
	 * servicoFaixada.IniciarAgendamento(servicoFaixada.getFuncionarios().get(0)
	 * );
	 * 
	 * // Como nenhum paciente foi agendado, este for deve retornar todos os //
	 * horarios disponiveis System.out.println(
	 * "Todos hor�rios est�o disponiveis, nenhum paciente agendado"); for
	 * (Periodo itemPeriodo : agenda.getPeriodos()) {
	 * System.out.println(itemPeriodo.getInicio().getHora() + "h �s " +
	 * itemPeriodo.getFim().getHora() + "h"); }
	 * 
	 * // Simula o agendamento de um paciente Data dt1 = Data.nova(8, 0); Data
	 * dt2 = Data.nova(9, 0);
	 * servicoFaixada.AgregarAgendaPaciente(servicoFaixada.Agendar(dt1, dt2),
	 * PacienteRepositorio.getPacientes().get(0)); System.out.println(
	 * "Ap�s agendar um paciente das 8h �s 9h esse periodo n�o est� mais disponivel"
	 * ); Agenda agenda1 =
	 * servicoFaixada.IniciarAgendamento(servicoFaixada.getFuncionarios().get(0)
	 * );
	 * 
	 * for (Periodo itemPeriodo : agenda1.getPeriodos()) {
	 * System.out.println(itemPeriodo.getInicio().getHora() + "h �s " +
	 * itemPeriodo.getFim().getHora() + "h"); } System.out.println("\n"); }
	 */
	public static void testUpdateAgendaPaciente() {

		ServicoFachada servicoFachada = new ServicoFachada();

		servicoFachada.cadastrarPaciente("Paciente1", "Paciente1");
		servicoFachada.cadastrarPaciente("Paciente2", "Paciente2");
		servicoFachada.cadastrarFuncionario("Funcionário Teste", "ACUPUNTURA", "4567890");

		Data inicio = Data.nova(8, 10);
		Data fim = Data.nova(9, 10);

		servicoFachada.AgregarAgendaPaciente(
				servicoFachada.Agendar(inicio, fim, servicoFachada.getFuncionarios().get(0)),
				servicoFachada.getPacientes().get(0));

		servicoFachada.solicitarDeleteAgendaPaciente(servicoFachada.getAgendaPaciente().get(0));

		// Funcionario funcionario2 = Funcionario.novo("Funcionário Teste",
		// "ACUPUNTURA", "4567890");
		// Paciente paciente2 = Paciente.novoPaciente("Paciente Teste", "567");
		// Paciente paciente3 = Paciente.novoPaciente("Paciente Test2", "123");
		//
		// Data inicio = Data.nova(8, 10);
		// Data fim = Data.nova(9, 10);
		// Periodo periodo = new Periodo(inicio, fim);
		//
		// List<Periodo> listaDePeriodos = new ArrayList<Periodo>();
		// listaDePeriodos.add(periodo);
		//
		// Agenda agenda = Agenda.nova(funcionario2, listaDePeriodos);

		// agenda.setPeriodos(listaDePeriodos);

		// AgendaPaciente agendaPaciente = AgendaPaciente.nova(agenda,
		// paciente2);

//		AgendaPacienteRepositorio agendaPacienteRepositorio = new AgendaPacienteRepositorio();
//		agendaPacienteRepositorio.insert(agendaPaciente);

//		Agenda agenda3 = Agenda.nova(funcionario2, listaDePeriodos);
//
//		agenda.setPeriodos(listaDePeriodos);
//		AgendaPaciente agendaPaciente3 = AgendaPaciente.nova(agenda3, paciente3);
//
//		AgendaPacienteRepositorio agendaPacienteRepositorio3 = new AgendaPacienteRepositorio();
//		agendaPacienteRepositorio.insert(agendaPaciente3);
//
//		List<AgendaPaciente> consultarLista = new ArrayList<AgendaPaciente>();
//		consultarLista = agendaPacienteRepositorio.findAll();
//		for (AgendaPaciente agendaPaciente2 : consultarLista) {
//			System.out.println(agendaPaciente2.getPaciente().getCpf());
//		}
//
//		agendaPacienteRepositorio3.delete(agendaPaciente3);
//		for (AgendaPaciente agendaPaciente2 : consultarLista) {
//			System.out.println(agendaPaciente2.getPaciente().getCpf());
//		}
	}

	public static void TesteSelectFuncionario1() {
		ServicoDeFuncionario criaFuncionario = new ServicoDeFuncionario();
		criaFuncionario.Criar("ronaldo", "ACUPUNTURA", "4567");
		criaFuncionario.Criar("Xablau", "MUSCULACAO", "451267");
		criaFuncionario.Criar("hepaminondas", "PILATES", "4534467");
		FuncionarioRepository MEGAREPOSITORIO = criaFuncionario.getFuncionarioRepositorio();
		for (Funcionario itemFuncionario : MEGAREPOSITORIO.getFuncionarios()) {
			System.out.println(itemFuncionario.getNome() + " " + itemFuncionario.getCrf());
		}
		System.out.println("acima está o db");
		List<Funcionario> lista32531 = new ArrayList<Funcionario>();
		Funcionario funcionario = Funcionario.novo("fhfhjg", "ACUPUNTURA", "4567");
		lista32531 = MEGAREPOSITORIO.select(funcionario);
		System.out.println(lista32531.size());
		for (Funcionario itemFuncionario : lista32531) {
			System.out.println(itemFuncionario.getNome() + " " + itemFuncionario.getCrf());
		}
	}

	
	/*
	 * public static void testarCriacaoFuncionario() { ServicoDeFuncionario
	 * criaFuncionario = new ServicoDeFuncionario();
	 * criaFuncionario.Criar("GUSTAVO", Especialidade.ACUPUNTURA, "4567");
	 * FuncionarioRepository funcionarioRepositorio = new
	 * FuncionarioRepository(); funcionarioRepositorio.getFuncionarios(); }
	 */

}
