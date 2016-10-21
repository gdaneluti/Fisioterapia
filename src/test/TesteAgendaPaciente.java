package test;

import org.junit.Test;

import entity.Funcionario;
import enumerate.Especialidade;
import service.ServicoFaixada;

public class TesteAgendaPaciente {

	@Test
	public void test() {
		
	}
	
	@Test
	public void BuscarHorariosLivres(){
		ServicoFaixada servicoFachada = new ServicoFaixada();
		Funcionario funcionario = Funcionario.novo("Gustavo", "ACUPUNTURA", "1234");
		servicoFachada.IniciarAgendamento(funcionario);
	}

}
