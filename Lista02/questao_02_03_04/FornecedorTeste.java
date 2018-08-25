
package questao_02_03_04;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliente
 */
public class FornecedorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor(0.0, 0.0,"", "", 0, 0.0);
        String nome, sexo, idade, altura, creditoMaximo,valorEmDivida;
        double saldoDisponivel;
        
        nome = JOptionPane.showInputDialog("Nome do Fornecedor?");
        fornecedor.setNome(nome);
        
        sexo = JOptionPane.showInputDialog("Sexo?");
        fornecedor.setSexo(sexo);
        
        idade = JOptionPane.showInputDialog("Qual a sua idade?");
        fornecedor.setIdade(Integer.parseInt(idade));
        
        altura = JOptionPane.showInputDialog("Qual a sua altura?");
        fornecedor.setAltura(Double.parseDouble(altura));
        
        creditoMaximo = JOptionPane.showInputDialog("Digite o limite de credito em determinado Fornecedor:");
        fornecedor.setCreditoMaximo(Double.parseDouble(creditoMaximo));
        
        valorEmDivida = JOptionPane.showInputDialog("Valor de divida em aberto:");
        fornecedor.setValorEmDivida(Double.parseDouble(valorEmDivida));
        
        saldoDisponivel = (fornecedor.getCreditoMaximo()-fornecedor.getValoremDivida());
        
        JOptionPane.showMessageDialog(null,"Nome: \n "+nome+"\nSexo: \n"+sexo+"\nAltura: "+altura+"\nIdade: \n"
        +idade+"\n Credito Máximo: \n"+creditoMaximo+"\n Divida em aberto: \n"+valorEmDivida+
                "\nSaldo disponível para compra: \n"+saldoDisponivel);
        
        
        
        
        
        
        
    }
    
}
