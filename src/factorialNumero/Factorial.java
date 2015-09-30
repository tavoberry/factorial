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
public class Factorial {
    
    private long fact;
    
    public Factorial(){
        fact=0;
    }


    /**
     * @return the fact
     */
    public long getFact() {
        return fact;
    }

    /**
     * @param fact the fact to set
     */
    public void setFact(long fact) {
        this.fact = fact;
    }
    
    /*public void captura(){
        numero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
    }*/
    
    public long calcularFactorial(int num){
        if (num==1 || num==0){
            return fact=1;
        }
        else{
            fact = num * calcularFactorial(num-1);
            return fact;
        }
    }    
    
           
    
    
}
