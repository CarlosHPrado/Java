/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_02_03_04;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliente
 */
public class AdministradorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrador administrador = new Administrador(0.0, 0.0, "", "", 0,0.0);
        
        
        String nome, sexo, salario, altura, idade, ajudasEmCusto;
        
        nome = JOptionPane.showInputDialog(null,"Qual o seu nome?");
        administrador.setNome(nome);
        sexo = JOptionPane.showInputDialog(null,"Qual sua sexualidade?");
        administrador.setSexo(sexo);
        altura = JOptionPane.showInputDialog(null,"Qual a sua altura?");
        administrador.setAltura(Double.parseDouble(altura));
        idade = JOptionPane.showInputDialog(null,"Qual a sua idade?");
        administrador.setIdade(Integer.parseInt(idade));
        salario = JOptionPane.showInputDialog(null, "Qual o seu salario? ");
        administrador.setSalario(Double.parseDouble(salario));
        ajudasEmCusto = JOptionPane.showInputDialog(null, "Valor recebido de ajuda de custos: ");
        administrador.setAjudaDeCusto(Double.parseDouble(ajudasEmCusto));
        
        JOptionPane.showMessageDialog(null,"O total do salario do Administrador é"+administrador.obterLucros());
        
        
        
    }    
}
