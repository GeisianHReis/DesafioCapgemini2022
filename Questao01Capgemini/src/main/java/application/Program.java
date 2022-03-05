package application;

import java.util.Scanner;

/**
 * @author Geisian Reis
 * @version 1.0.0
 * 
 */
public class Program {

	/**
	 * Método principal Solicita ao usuario a quantidade de numeros que vai haver na lista, em seguida chama o metodo
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros sua lista tera?");
		int numeroDeElementos = sc.nextInt();

		System.out.println(Mediana.mediana(numeroDeElementos));

		sc.close();
	}

}
