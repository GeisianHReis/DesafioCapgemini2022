package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProgramTest {

	@Test
	public void testMain() {
		int[] numeros = {9, 8, 5, 2, 11, 15, 23, 17, 7};
		int diferenca = 3;
		
		int quantidade = Comparador.Verificacao(numeros, diferenca);
		
		assertEquals(3 , quantidade);
	}

}
