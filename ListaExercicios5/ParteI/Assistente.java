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
public class Assistente extends Funcionario{
    
    private double numMatricula;

    public Assistente(double numMatricula,String nome) {
       super(nome);
       this.numMatricula = numMatricula ;
        
    }

    public double getMatricula() {
        return numMatricula;
    }

    public void setMatricula(int matricula) {
        this.numMatricula = matricula;
    }

    @Override
    public String exibirDados() {
        return "Nome:"+getNome()+"\t Matricula:"+getMatricula();
    }
    
    
}
