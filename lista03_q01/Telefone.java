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
public class Telefone extends MeioComunicacao{
    
    int ramais;
    double tamanhoCabo;
    
      @Override
    public String fazerLigacao() {
        return null;
    }
    
    public void setRamais(int ramais){
        this.ramais = ramais;
    }
    public int getRamais(){
        return ramais;
    }
    
    public void setTamanhoCabo(double tamanhoCabo){
        this.tamanhoCabo = tamanhoCabo;
    }
    public double getTamanhoCabo(){
        return tamanhoCabo;
    }
    
    public Telefone(String cor, String modelo, String tipo, int ramais, double tamanhoCabo){
        super(cor, modelo, tipo);
        this.ramais = ramais;
        this.tamanhoCabo = tamanhoCabo;
    }

  
}
