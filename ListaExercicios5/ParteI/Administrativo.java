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
public class Administrativo extends Assistente{
    
    double adicionalNoturno;
    
    public Administrativo(double numMatricula, String nome) {
        super(numMatricula, nome);
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
    
    
    
    public Double adicionalNoturno (Double salario){
                
        salario= salario+(salario*getAdicionalNoturno());
        return salario;
    }
    
}
