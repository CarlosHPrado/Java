/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_aula04;

/**
 *
 * @author Cliente
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CaixinhaJbl jbl = new CaixinhaJbl();
        CDPlayer cdplayer = new CDPlayer();
        Radio radio = new Radio();
        
        jbl.ligaSom();
        jbl.aumentaVolume(15);
        jbl.diminuiVolume(3);
        jbl.desligarSom();
        
        
        cdplayer.ligaSom();
        cdplayer.aumentaVolume(30);
        cdplayer.diminuiVolume(15);
        cdplayer.desligarSom();
        
        radio.ligaSom();
        radio.aumentaVolume(27);
        radio.diminuiVolume(2);
        radio.desligarSom();
        
               
        
        
        
    }
    
}
