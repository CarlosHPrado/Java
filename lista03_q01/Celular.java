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
public class Celular extends MeioComunicacao {

    
  
    @Override
    public  String fazerLigacao() {
        return null;
    }
    
   boolean touchScreen;
   String smartPhone;
   int statusBateria;
   double frequenciaTransmissao;
   
   public void setTouchScreen(boolean touchScreen){
       this.touchScreen = touchScreen;
   }
   public boolean getTouchScreen(){
       return touchScreen;
   }
   
   public void setSmartPhone(String smartPhone){
       this.smartPhone = smartPhone;
   }
   public String getSmartPhone(){
       return smartPhone;
   } 
   
   public void setStatusBateria(int statusBateria){
       this.statusBateria=statusBateria;
   }
   public int getStatusBateria(){
       return statusBateria;
   }
   
   public void setFrequenciaTransmissao(double frequenciaTransmissao){
       this.frequenciaTransmissao = frequenciaTransmissao;
   }
   public double getFrequenciaTransmissao(){
       return frequenciaTransmissao;
   }
   
   public Celular(String cor, String modelo, String tipo, boolean touchScreen, String smartPhone, int statusBateria, double frequenciaTransmissao){
       super(cor, modelo, tipo);
       this.touchScreen = touchScreen;
       this.smartPhone = smartPhone;
       this.statusBateria  = statusBateria;
       this.frequenciaTransmissao = frequenciaTransmissao;
   }

    
   
}
