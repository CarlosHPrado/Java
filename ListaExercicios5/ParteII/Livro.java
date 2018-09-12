/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteII;

/**
 *
 * @author Cliente
 */
public class Livro extends Produto {

private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro(String autor, String nomeLoja, Double preco, String descricao) {
        super(nomeLoja, preco, descricao);
        this.autor = autor;
    }

@Override
    public String getDescricao(){
        return "Este livro retrata a renomada historia de "+this.autor;
              
    }


}
