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
public class Velho extends Imovel{
    
    private double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public String precoComDesconto(){
        double valorTotal = (super.getPreco()-getDesconto());
        return "O valor do imovél com desconto é: R$"+valorTotal;
    }
    
}
