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
public class Cocker extends Cachorro {
    
    private boolean tosa;

      
    
    public boolean setTosa(boolean tosa){
        return this.tosa = tosa;
    }
    
    public void precisaTosa(){
        if (tosa == true){
            System.out.println("Precisa de tosa.");
        } else {
            System.out.println("Não precisa de tosa.");
    }
        
    }

    public Cocker(boolean tosa, String nome, String raca, String tipo, String cor) {
        super(nome, raca, tipo, cor);
        this.tosa = tosa;
    }
 
}
