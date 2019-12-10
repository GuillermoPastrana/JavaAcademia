/*Dados 2 valores enteros mayores a 0, regresar cualquiera que sea el valor mas cercano a 21, 
 * sin pasar de este. Regresar 0 si ambos se pasan*/
package Questions;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Ingresar primer valor: ");
		n1 = scn.nextInt();
		
		System.out.println("Ingresar segundo valor: ");
		n2 = scn.nextInt();
		
			if (n1 > 21) {
				if (n2 > 21) {
					System.out.println("El valor es 0");
				} else {
					System.out.println("El valor es" + n2);
				}
			} else {
				System.out.println("El valor es " + n1);	
		}
	}
}
