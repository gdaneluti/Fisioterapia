package test;

import static org.junit.Assert.*;

import org.junit.Test;

import service.ServicoFaixada;

public class TesteGetEspecialidades {

	@Test
	public void test() {
		
	}
	
	@Test
	public void testGetEspecialidades(){
		ServicoFaixada servicoFaixada = new ServicoFaixada();
		assertEquals(4, servicoFaixada.getEspecialidades().size());
	}

}
