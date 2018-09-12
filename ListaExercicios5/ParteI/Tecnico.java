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
public class Tecnico extends Assistente{
    
    double salarioAdc;

    public double getSalarioAdc() {
        return salarioAdc;
    }

    public void setSalarioAdc(double salarioAdc) {
        this.salarioAdc = salarioAdc;
    }
    
    public Tecnico(double numMatricula, String nome) {
        super(numMatricula, nome);
    }
    
    
    public Double bonusSalarial(Double salario){
        salario = salario+(salario*getSalarioAdc());
        return salario;
    }
    
}
