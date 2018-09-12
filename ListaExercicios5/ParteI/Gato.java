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
public class Gato extends Animal {

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    public String Mia() {
        return "Miau";
    }

    @Override
    public String caminha() {
        return "O gato está se movendo.";
    }

    
}
