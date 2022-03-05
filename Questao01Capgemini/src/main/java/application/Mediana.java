package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Geisian Reis
 * @version 1.0.0
 * @since Release 1.0.0
 */
public abstract class Mediana {
	
	/**
	 * Povoa o ArrayList conforme o numero de elementos informado pelo usuario e tambem ordena
	 * 
	 * @param numeroDeElementos	Difine o tamanho do Array
	 * @return A mediana do Array
	 * 
	 */
	public static int mediana(int numeroDeElementos) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		for (int x = 1; x <= numeroDeElementos; x++) {
			System.out.println("Digite o "+x+"º numero.");
			int itemLista = sc.nextInt();
			list.add(itemLista);
		}
		
		Collections.sort(list);
			
		int	indiceMediana = list.size() / 2;
		int mediana = list.get(indiceMediana);
		sc.close();
		return mediana;
	}
}
