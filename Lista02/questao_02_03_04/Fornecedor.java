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
public class Fornecedor extends Pessoa {
    
        double creditoMaximo, valorEmDivida;
        
        public double getCreditoMaximo(){
            return this.creditoMaximo;
        }
        public void setCreditoMaximo(double creditoMaximo){
            this.creditoMaximo = creditoMaximo;
        }
        
        public double getValoremDivida(){
            return this.valorEmDivida;
        }
        public void setValorEmDivida(double valorEmDivida){
            this.valorEmDivida = valorEmDivida;
        }
        
        public Fornecedor(double valorEmDivida, double creditoMaximo,String nome, String sexo, int idade, double altura){
            super(nome,sexo,idade, altura);
            this.creditoMaximo = creditoMaximo;
            this.valorEmDivida = valorEmDivida;
            
        }
}
