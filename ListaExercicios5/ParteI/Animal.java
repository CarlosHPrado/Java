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

    public abstract class Animal {

    private String nome,raca;
   

    public abstract String caminha();

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }
    public Animal(){
        
    }
    

}

