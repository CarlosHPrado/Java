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
public class Pessoa {
    
    protected String nome;
    protected String sexo;
    protected double altura;
    protected int idade;
    
    public String getNome(){
        return this.nome;
    }
    public void  setNome(String nome){
        this.nome = nome;   
    }
    
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public Pessoa(String nome, String sexo, int idade, double altura){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    } 
    
}
