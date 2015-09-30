/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialNumero;

import javax.swing.JOptionPane;

/**
 *
 * @author tavoberry
 */
public class UsoFactorial {
    
    public static void main(String []args){
        Factorial unNumero = new Factorial();
        
        System.out.println(unNumero.calcularFactorial(5));
        System.out.println(unNumero.calcularFactorial(4));
        System.out.println(unNumero.calcularFactorial(3));
        System.out.println(unNumero.calcularFactorial(2));
        System.out.println(unNumero.calcularFactorial(1));
        System.out.println(unNumero.calcularFactorial(7));
            
    }
}
