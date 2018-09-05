/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_aula4;

/**
 *
 * @author Cliente
 */
public interface ItensBiblioteca {
    
    public void disponivel(String disponivel);        
    public void emprestado(String emprestado);
    public void emAtraso (String emAtraso);
    public void reservado (String reservado);
       
    
    
}
