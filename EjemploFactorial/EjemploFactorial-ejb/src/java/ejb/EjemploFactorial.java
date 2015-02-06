/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author VAIO
 */
@Stateless
public class EjemploFactorial implements EjemploFactorialRemote {

    @Override
    public long calcularFactorial(int n) {
        if(n<1){
            return 1;
        }
        else{return n* calcularFactorial(n-1);}
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
