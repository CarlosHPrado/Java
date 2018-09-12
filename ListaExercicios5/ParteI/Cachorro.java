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
public class Cachorro extends Animal {

    public String late() {
        return "Au Au";
    }

    @Override
    public String caminha() {
        return "O cachorro esta se movendo";
    }
}
