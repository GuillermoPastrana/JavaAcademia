/*Dada una cadena cualquiera A, imprimir "Si", si es un palíndromo. De lo contrario, 
 * imprimir "No".*/

package Questions;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		String[] palabras = {"reconocer","asdfdsa","AsDdSa","Sale El As","No palindromos","Cualquier frase","O palabra","Que no sea palindromo"};
        int indice = (int)(Math.random() * palabras.length);
        System.out.println("Palabra utilizada: "+ palabras[indice]);
        if (palindromo(palabras[indice]))
            System.out.println("Palindromo");
        else
            System.out.println("No Palindromo");
    }
    static boolean palindromo(String palabra)
    {
        //Quitar espacios y convertirlo a minusculas para hacer las comparaciones
        String modificado = palabra.replaceAll(" ","").toLowerCase();
        int i=0;
        while (i < modificado.length() / 2)
        {
            if (modificado.charAt(i) != modificado.charAt(modificado.length() -1 -i))
                return false;
            i++;
        }
        return true;
    }
}
		
		

