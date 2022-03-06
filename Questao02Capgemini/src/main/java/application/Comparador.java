package application;

/**
 * @author Geisian Reis
 * @version 1.0.0
 * @since Release 1.0.0
 */
public abstract class Comparador {

	/**
	 *  Ao receber o vetor numeros faz a verifica��oe e retonas a quantidade de numeros com a diferen�a desejada
	 *  
	 * @param numeros Vetor com os numeros a serem verificados
	 * @param diferenca Inteiro com a diferen�a que deseja ser observada
	 * @return
	 */
	public static int Verificacao(int[] numeros, int diferenca) {
		int quantidade = 0;

		for (int x = 0; x < numeros.length; x++) {
			for (int y = 0; y < numeros.length; y++) {
				if ((numeros[x] - numeros[y]) == diferenca) {
					quantidade++;
				}
			}
		}
		return quantidade;
	}
}
