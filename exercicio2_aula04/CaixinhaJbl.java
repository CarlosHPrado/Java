/*9
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_aula04;

/**
 *
 * @author Cliente
 */
public class CaixinhaJbl implements AparelhoDeSom {
    
              
    @Override
    public String ligaSom() {
        return "Som ligado";
    }

    @Override
    public String desligarSom() {
        return "Som desligado";
    }

    @Override
    public void aumentaVolume(int valor) {
    }

    @Override
    public void diminuiVolume(int valor) {
    }
    
    
    
    
}
