/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

/**
 *
 * @author Cliente
 */
public class Animal {
    
    private String tipo;
    private String cor;
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public Animal(String tipo, String cor){
        this.cor = cor;
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
       return (getTipo()+getCor());   
    }
    
    
}
