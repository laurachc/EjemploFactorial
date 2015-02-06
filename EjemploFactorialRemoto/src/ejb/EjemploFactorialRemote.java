/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Remote;

/**
 *
 * @author VAIO
 */
@Remote
public interface EjemploFactorialRemote {

    long calcularFactorial(int n);
    
}
