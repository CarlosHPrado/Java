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
public class EmpregadoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Empregado empregado= new Empregado(0.0, "", "", 0, 0);
        
        String  salario,  nome,  sexo,  idade,  altura;
            
        nome = JOptionPane.showInputDialog(null,"Qual o seu nome?");
        empregado.setNome(nome);
        sexo = JOptionPane.showInputDialog(null,"Qual sua sexualidade?");
        empregado.setSexo(sexo);
        altura = JOptionPane.showInputDialog(null,"Qual a sua altura?");
        empregado.setAltura(Double.parseDouble(altura));
        idade = JOptionPane.showInputDialog(null,"Qual a sua idade?");
        empregado.setIdade(Integer.parseInt(idade));
        salario = JOptionPane.showInputDialog(null, "Qual o seu salario? ");
        empregado.setSalario(Double.parseDouble(salario));
        
        JOptionPane.showMessageDialog(null,"Nome: \n "+nome+"\nSexo: \n"+sexo+"\nAltura: "+altura+"\nIdade: \n"
        +idade+"\nSalario: \n"+salario);
        
        
        
 }
 
    
}
