/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03_q01;

/**
 *
 * @author Cliente
 */
public abstract class  MeioComunicacao {
    
    private String cor;
    private String modelo;
    private String tipo;
    
    public abstract String fazerLigacao();
    
    public void serCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public MeioComunicacao(String cor, String modelo, String tipo){
        this.cor = cor;
        this.modelo = modelo;
        this.tipo = tipo;
      
        
    }
    
}
