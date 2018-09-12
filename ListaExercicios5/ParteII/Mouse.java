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
public class Mouse extends Produto {
    
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String getDescricao(){
        return this.tipo+" mouse optico, Saída USB.  1.600 DPI";
   
    }

    public Mouse(String tipo, String nomeLoja, Double preco, String descricao) {
        super(nomeLoja, preco, "mouse optico, Saída USB.  1.600 DPI.");
        this.tipo = tipo;
    }
        
    
}
