/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03_q01;


import javax.swing.JOptionPane;
/**
 *
 * @author Cliente
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Celular cell = new Celular("","","",false,"", 0, 0.0);
        Telefone tel = new Telefone("","","",0,0.0);
        
        String tipo, cor, modelo, touchScreen, smartPhone, ramais, tamanhoCabo,statusBateria, frequenciaTransmissao;
        
        modelo = JOptionPane.showInputDialog("Qual o modelo do seu aparelho?");
        cor = JOptionPane.showInputDialog("Qual a cor do seu aparelho?");
        tipo = JOptionPane.showInputDialog("Digite o tipo do telefone: \n1. para movel  \n2. para Fixo");
        if ("1".equals(tipo)){
            cell.setTipo(tipo);
            touchScreen = JOptionPane.showInputDialog("Seu aparelho é Touch Screen? \n1. Sim \n2. Não");
                  if ("1".equals(touchScreen)){
                      cell.setTouchScreen(true);
                  }  
                  else if ("2".equals(touchScreen)){
                      cell.setTouchScreen(false);
                  }
            smartPhone = JOptionPane.showInputDialog("Seu aparelho é um Smartphone?");
            cell.setSmartPhone(smartPhone);
            
            statusBateria = JOptionPane.showInputDialog("Digite a % atual do contador  de energia da sua bateria:");
            cell.setStatusBateria(Integer.parseInt(statusBateria));
            
            frequenciaTransmissao = JOptionPane.showInputDialog("Digite a frequencia de Transmissão de seu aparelho:");
            cell.setFrequenciaTransmissao(Double.parseDouble(frequenciaTransmissao));
            
                
        }
        else if("2".equals(tipo)){
            tel.setTipo(tipo);
            
            ramais = JOptionPane.showInputDialog("Seu telefone possui quantos ramais?");
            tel.setRamais(Integer.parseInt(ramais));
            
            tamanhoCabo = JOptionPane.showInputDialog("Digite o tamanho do cabo(m) do seu telefone (se preencher com 0 o programa entendera que é um telefone sem fio ).");
            tel.setTamanhoCabo(Double.parseDouble(tamanhoCabo));
        }
        
        
        
       
    }
    
}
