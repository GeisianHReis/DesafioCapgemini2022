package application;

/**
 * @author Geisian Reis
 * @version 1.0.0
 * 
 */
public class Program {

	/**
	 * Método principal 
	 * Pega o vetor de numeros interios, a direfença que deseja ser observada e faz a chamada do metodo 
	 * 
	 */
	public static void main(String[] args) {
		int[] numeros = {3, 6, 4, 7, 9};
		int diferenca = 2;
		
		int quantidade = Comparador.Verificacao(numeros, diferenca);
		
		System.out.println(quantidade);
		
	}

}
