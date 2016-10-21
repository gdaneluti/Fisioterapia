package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Repository.FuncionarioRepository;
import enumerate.Especialidade;
import service.ServicoDeFuncionario;
import service.ServicoFachada;

public class TesteFuncionario {

	@Test
	public void test() {
		
	}
	
	@Test
	public void testeCriacaoFuncionario(){
		ServicoDeFuncionario criaFuncionario = new ServicoDeFuncionario();
		assertTrue(criaFuncionario.Criar("GUSTAVO", "ACUPUNTURA", "4567"));
		assertFalse(criaFuncionario.Criar("WENDLER", "FISIOTERAPIAMANUAL", "4567"));
	}
	
	@Test
	public void testeCadastrarFuncionario(){
		ServicoFachada servicoFaixada = new ServicoFachada();
		assertEquals(0, FuncionarioRepository.getFuncionarios().size());
		assertTrue(servicoFaixada.cadastrarFuncionario("Matheus", "ACUPUNTURA", "123456"));
		assertEquals(1, FuncionarioRepository.getFuncionarios().size());
	}
	
	@Test
	public void testandoLoginFuncionario() {
		ServicoDeFuncionario servicoDeFuncionario = new ServicoDeFuncionario();
		servicoDeFuncionario.Criar("FUNCIONARIO 1", "MUSCULACAO", "1978");
		servicoDeFuncionario.Criar("FUNCIONARIO 2", "ACUPUNTURA", "1943");
		assertTrue(servicoDeFuncionario.loginFuncionario("1943"));

	}

}
