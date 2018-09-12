/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercios05;

/**
 *
 * @author Cliente
 */
public class Vip extends Ingresso {
    
    double adicionalVip = 10.00;
    @Override
    public double imprimeValor() {

        double ingressoVip = (super.imprimeValor()+adicionalVip);
        return ingressoVip;
    }
}
