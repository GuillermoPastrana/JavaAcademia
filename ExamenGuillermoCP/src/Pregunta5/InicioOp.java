/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta5;

import Questions.Question5;

/**
 *
 * @author Pastrana
 */
public class InicioOp {
    public static void main(String[] args) {
        Question5 q = new Question5();
        q.Sumar(); 
        System.out.println("La suma es: " + q.getR());
        
        q.Restar();
        System.out.println("La resta es: " + q.getR());
        
        q.Mulplicar();
        System.out.println("La multiplicacion es: " + q.getR());
        
        q.Dividir();
        System.out.println("La division es: " + q.getR());
    }
}
