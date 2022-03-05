package application;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Geisian Reis
 * @version 1.0.0
 * @since Release 1.0.0
 */
public abstract class Encriptar {

	/**
	 * Elimina os espaços e realiza a ecriptação do texto
	 * 
	 * @param frase	Frase a ser ecriptada
	 */
	public static void Encripar(String frase) {

		String fraseSemEspaco = frase.replace(" ", "");
		int colunas = (int) Math.ceil(Math.sqrt(fraseSemEspaco.length()));
		List<String> partes = new ArrayList<String>();
		for (int i = 0; i < fraseSemEspaco.length(); i += colunas) {
			partes.add(fraseSemEspaco.substring(i, Math.min(i + colunas, fraseSemEspaco.length())));
		}
		for (int i = 0; i < partes.size(); i++) {
			
			for(int x = 0; x < partes.size(); x++)
				try {
					char char1 = partes.get(x).charAt(i);
					System.out.print(char1);
				}catch (StringIndexOutOfBoundsException e) {
					
				}
			System.out.print(" ");
		}
	}
}
