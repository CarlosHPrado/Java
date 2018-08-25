/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;
import javax.swing.JOptionPane;
/**
 *
 * @author Cliente
 */
public class CockerTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomeAnimal, corAnimal,racaAnimal, tipoAnimal, tosaAnimal;
        
        
        tipoAnimal = JOptionPane.showInputDialog("Qual o tipo do Animal?", "Preencha os dados");
        corAnimal = JOptionPane.showInputDialog("Qual a cor do animal?");
        nomeAnimal = JOptionPane.showInputDialog("Qual o nome o Animal?");
        racaAnimal = JOptionPane.showInputDialog("Qual a raça do animal?");
        tosaAnimal = JOptionPane.showInputDialog("Deseja tosar o Animal?");
        
    //    Animal ani = new Animal(tipoAnimal, corAnimal);
       
        Cocker cock = new Cocker(true, nomeAnimal, racaAnimal, tipoAnimal, corAnimal);
        cock.setNome(nomeAnimal);
        cock.setRaça(racaAnimal);
        cock.setTipo(tipoAnimal);
        cock.setCor(corAnimal);
        cock.setTosa(Boolean.parseBoolean(tosaAnimal));
        
        
        JOptionPane.showMessageDialog(null,"nome"+cock.getNome()+"\n Raça"+cock.getRaca());
        
    }
    
    
        
    
}
