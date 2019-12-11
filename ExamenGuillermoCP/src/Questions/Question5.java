/*.Crear una interfaz de Java (en su propio paquete) que defina las cuatro operaciones aritmeticas suma, 
 *resta, multiplicacion y division usando 2 numeros enteros. Enseguida, crear una clase de Java que 
 *implemente dicha interfaz (en un paquete diferente) que permita llevar a cabo estas operaciones.*/
package Questions;

import Pregunta5.Operaciones;

public class Question5 implements Operaciones{ 
    
    private int n1 = 10;
    private int n2 = 5;
    private int r;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void Sumar() {
        r = n1 + n2;
    }

    @Override
    public void Restar() {
        r = n1 - n2;
    }

    @Override
    public void Mulplicar() {
        r = n1 * n2;
    }

    @Override
    public void Dividir() { 
        r = n1 / n2;
    }

  
}
