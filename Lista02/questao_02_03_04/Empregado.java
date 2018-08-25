package questao_02_03_04;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliente
 */
public class Empregado extends Pessoa {
    
        protected double salario;
        
       
        public double getSalario(){
            return this.salario;
        }
        public void setSalario(double salario){
            this.salario = salario;
        }
        public Empregado (double salario, String nome, String sexo, int idade, double altura){
            super(nome, sexo, idade, altura);
            this.salario = salario;
        }
        
        public Double obterLucros(){
           return salario;
        }

    double setSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
    
    
    

