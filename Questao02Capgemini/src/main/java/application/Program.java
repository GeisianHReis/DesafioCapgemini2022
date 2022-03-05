package application;

/**
 * @author Geisian Reis
 * @version 1.0.0
 * 
 */
public class Program {

	/**
	 * Método principal 
	 * Pega o vetor de numeros interios e compara seus elementos para verificar a diferença entre eles. 
	 * 
	 */
	public static void main(String[] args) {
		int [] numeros = {3, 6, 4, 7, 9};
		
		int diferenca = 2;
		int quantidade = 0;
		
		for (int x = 0; x < numeros.length; x++) {
			for (int y = 0; y < numeros.length; y++) {
				if((numeros[x] - numeros[y]) == diferenca) {
					quantidade++;
				}
			}
		}
		System.out.println(quantidade);
		
	}

}
