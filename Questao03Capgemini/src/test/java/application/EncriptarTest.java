package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncriptarTest {

	@Test
	public void testEncripar() {
		String frase = ("tenha um bom dia");
		String fraseEncriptada = Encriptar.Encripar(frase);
		
		assertEquals("taoa eum nmd hbi " ,fraseEncriptada);
	}

}
