/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_02_03_04;


/**
 *
 * @author Cliente
 */
public class Administrador extends Empregado {
    
        double ajudasDeCusto;
        
   
        
        public void setAjudaDeCusto(double ajudasDeCusto){
            this.ajudasDeCusto =ajudasDeCusto;
        }
        public double getAjudasDeCustos(){
            return this.ajudasDeCusto;
        }
        
        public Administrador(double ajudasDeCusto, double salario, String nome, String sexo, int idade, double altura){
        super( salario,nome, sexo, idade, altura);
        this.ajudasDeCusto = ajudasDeCusto;
        this.salario = salario;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        }
        
        @Override
        public Double obterLucros(){
            return (super.setSalario()+this.setAjudaDeCusto());
        }

    private double setAjudaDeCusto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


        

