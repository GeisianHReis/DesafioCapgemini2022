package application;

import java.util.Scanner;

/**
 * @author Geisian Reis
 * @version 1.0.0
 * 
 */
public class Program {
	/**
	 * Método principal 
	 * Recebe o texto a ser encriptado
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a frase a ser encriptado:");
		String frase = sc.nextLine();
		
		System.out.println(Encriptar.Encripar(frase));
		sc.close();

	}
}
