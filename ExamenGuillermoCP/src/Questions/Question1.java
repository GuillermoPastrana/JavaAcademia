/*Dado un entero N, imprimir sus primeros 10 multiplos. Cada multiplo N x I 
(donde 1 <= i <= 10) debe ser impreso en una nueva linea en la forma "N x i = resultado"*/
package Questions;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n;
		
		System.out.println("Ingresar un entero: ");
		n = scn.nextInt();
		
		for (int i=1; i<=10; i++){
			 
            int r=i*n;
            System.out.println(i+"*"+n+"="+r);
        }
	}
}