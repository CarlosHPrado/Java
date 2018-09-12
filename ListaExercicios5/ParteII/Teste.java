/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteII;
import java.util.ArrayList;
/**
 *
 * @author Cliente
 */
public class Teste {

    public static void main(String[] args) {

        ArrayList< Produto> carrinho = new ArrayList();

        Mouse mouse1 = new Mouse("", "",0.0, "");
        mouse1.setNomeLoja("Lojas Americanas");
        mouse1.setPreco(89.90);
        mouse1.setTipo("Conexão via bluetooth");
        mouse1.getDescricao();
        
        Mouse mouse2 = new Mouse("", "", 0.0, "");
        mouse2.setNomeLoja("Kaboom");
        mouse2.setPreco(59.90);
        mouse2.setTipo("Saída USB");
        mouse2.getDescricao();

        Livro livro1 = new Livro("", "", 0.0, "");
        livro1.setNomeLoja("Saraiva");
        livro1.setPreco(109.90);
        livro1.setAutor("Hebert Richards");
        
        Livro livro2 = new Livro("","",0.0,"");
        livro2.setNomeLoja("Leitura");
        livro2.setPreco(25.00);
        livro2.setAutor("Alamo");
        
        carrinho.add(mouse1);
        carrinho.add(mouse2);
        carrinho.add(livro1);
        carrinho.add(livro2);

        for (int i = 0; i < carrinho.size(); i++) {

            System.out.println(carrinho.get(i).getDescricao());

        }

    }

}
