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
public abstract class Funcionario {
 
    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Funcionario(String nome) {
        this.nome = nome;
    }

  public abstract String exibirDados();
    
    
}
