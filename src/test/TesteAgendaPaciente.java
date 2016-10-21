package test;

import org.junit.Test;

import entity.Funcionario;
import enumerate.Especialidade;
import service.ServicoFachada;

public class TesteAgendaPaciente {

	@Test
	public void test() {
		
	}
	
	@Test
	public void BuscarHorariosLivres(){
		ServicoFachada servicoFachada = new ServicoFachada();
		Funcionario funcionario = Funcionario.novo("Gustavo", "ACUPUNTURA", "1234");
		servicoFachada.IniciarAgendamento(funcionario);
	}

}
