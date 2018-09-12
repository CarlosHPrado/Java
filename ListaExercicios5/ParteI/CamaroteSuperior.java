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
public class CamaroteSuperior extends Vip{
    
    
    double adicionalCamSuperior = 25.00;

  
    
    @Override
    public double imprimeValor(){
        
        Double ingressoCamarote = (super.getValorIngresso() + adicionalCamSuperior) ;
        return ingressoCamarote;
    }
    
    
}    

