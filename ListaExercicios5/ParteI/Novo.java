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
public class Novo extends Imovel {

    private double valorAdicional;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

   

    public String valorComAdicional() {
        double valorTotal = (super.getPreco() + getValorAdicional());
        return "O valor total do imóvel Novo: " + valorTotal;
    }


}