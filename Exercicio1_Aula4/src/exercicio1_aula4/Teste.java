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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        Revista revista = new Revista();
        Tese tese = new Tese();
        
        livro.disponivel("Não");
        tese.disponivel("Sim");
        revista.disponivel("Sim");
        
        livro.emAtraso("Sim");
        tese.emAtraso("Não");
        revista.emAtraso("Não");
        
        livro.emprestado("Sim");
        tese.emprestado("Não");
        revista.emprestado("Sim");
        
        livro.reservado("Sim");
        tese.reservado("Sim");
        revista.reservado("Não");
        
        
    }
    
}
