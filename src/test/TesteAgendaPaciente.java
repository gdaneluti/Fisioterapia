package test;

import java.util.List;

import org.junit.Test;

import entity.Agenda;
import entity.Data;
import entity.Funcionario;
import service.ServicoFachada;

public class TesteAgendaPaciente {

	@Test
	public void test() {
	}

	@Test
	public void BuscarHorariosLivres() {
		ServicoFachada servicoFachada = new ServicoFachada();
		Funcionario funcionario = Funcionario.novo("Gustavo", "ACUNPULTURA", "1234");
		servicoFachada.IniciarAgendamento(funcionario);
	}

	@Test
	public void TesteMostrarAgendaDisponivel() {
		ServicoFachada servicoFachada = new ServicoFachada();
		servicoFachada.cadastrarPaciente("Leia Organa", "1981");
		servicoFachada.cadastrarFuncionario("Anakin Skywalker", "FISIOTERAPIA MANUAL", "66");
		Data inicio = Data.nova(8, 10);
		Data fim = Data.nova(9, 10);
		servicoFachada.Agendar(inicio, fim, servicoFachada.solicitarFuncionarioByCrf("66"));
		servicoFachada.AgregarAgendaPaciente(
				servicoFachada.Agendar(inicio, fim, servicoFachada.solicitarFuncionarioByCrf("66")),
				servicoFachada.getPacientes().get(0));

		for (Agenda agenda : servicoFachada.solicitarAgendaPacienteByCpf("1981")) {
			System.out.println(agenda.getPeriodos().get(0).getInicio().getHora() + "h as "
					+ agenda.getPeriodos().get(0).getFim().getHora() + "h");
		}

	}
}
