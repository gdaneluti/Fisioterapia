package test;

import static org.junit.Assert.*;

import org.junit.Test;

import service.ServicoFachada;

public class TesteGetEspecialidades {

	@Test
	public void test() {
		
	}
	
	@Test
	public void testGetEspecialidades(){
		ServicoFachada servicoFaixada = new ServicoFachada();
		assertEquals(4, servicoFaixada.getEspecialidades().size());
	}

}
