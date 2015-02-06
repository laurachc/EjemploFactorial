/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import ejb.EjemploFactorialRemote;
import javax.ejb.EJB;
import javax.swing.JOptionPane;

/**
 *
 * @author VAIO
 */
public class Main {
    @EJB
    private static EjemploFactorialRemote ejemploFactorial;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int s=9;
         JOptionPane.showMessageDialog(null,"El Resultado es"+ejemploFactorial.calcularFactorial(s),"Factorial", JOptionPane.INFORMATION_MESSAGE);
        // TODO code application logic here
    }
    
}
