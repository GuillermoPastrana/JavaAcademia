/*.Dados 2 arrays de enteros j y K, cada uno de tamaño 3, 
 * regresar un arreglo nuevo de tamaño 2 que contenga sus elementos medios*/
package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		List<Integer> j = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			Integer numero = scn.nextInt();
			j.add(i, numero);
			
		}
		
		System.out.println(j);
			 

		List<Integer> k = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			Integer numero = scn.nextInt();
			k.add(i, numero);
		}
		
		System.out.println(k);
		
		
	}
}
