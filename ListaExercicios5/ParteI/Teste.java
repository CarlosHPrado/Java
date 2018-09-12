/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercios05;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tecnico tecnico = new Tecnico(0, "");
        tecnico.setNome("Jair Siakos Tumando");
        tecnico.setMatricula(00001);
        
        System.out.println("Nome:" + tecnico.getNome());
        System.out.println("Matricula:" + tecnico.getMatricula());
        
        
        Administrativo administrativo = new Administrativo(0, "");
        administrativo.setNome("Sentaki Hagorah");
        administrativo.setMatricula(112);
                
        System.out.println("Nome:" + administrativo.getNome());
        System.out.println("Matricula:" + administrativo.getMatricula());

        
        Cachorro cachorro = new Cachorro();
        cachorro.late();
        cachorro.caminha();
        
        Gato gato = new Gato("","");
        gato.Mia();
        gato.caminha();
  
        int opcao=0; 
        Ingresso ingresso = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual tipo de ingresso você deseja?\nDigite 1 para normal\nDigite 2 para vip");
        scanner.nextInt();
        if (opcao == 1) {

            Normal normal = new Normal();
            normal.setValorIngresso(15.00);
            System.out.println("O valor do Ingresso é de "+normal.getValorIngresso()+normal.ingressoNormal());
        }
        else if(opcao==2){
            System.out.println("Agora digite qual Camarote deseja ir:\n1 para Superior\n2 para Inferior");
            opcao=scanner.nextInt();
            
            if(opcao==1){
                CamaroteSuperior camaroteSup = new CamaroteSuperior();
                System.out.println("O valor do ingresso é:"+camaroteSup.imprimeValor());
            }
            else if(opcao==2){
                CamaroteInferior camaroteInf= new CamaroteInferior();
                camaroteInf.setLocalizacao("Centro");
                camaroteInf.setValorIngresso(25.00);
                
                System.out.println("O valor do ingresso é:" +camaroteInf.getValorIngresso()+"\nE esta localizado:" +camaroteInf.getLocalizacao());
            }
        }

        System.out.println("Digite qual a opção de imovel você esta procurando:\n1 para Usado\n2 para Novo");
        opcao=scanner.nextInt();
        
        if(opcao==1){

            
            Novo novo = new Novo();
            novo.setEndereco("Rua Bolso chacara Naro Nº 17 - Brasília");
            novo.setPreco(20000);
            novo.setValorAdicional(10000);          
            System.out.println("O valor total do imóvel fica:"+novo.valorComAdicional());
                   
        }
        else if(opcao==2){
            Velho velho= new Velho();
            
            velho.setEndereco("Rua Lulinha 9 dedos bloco A ap 171 - Coritiba");
            velho.setPreco(13000);
            velho.setDesconto(1000);
            System.out.println("O valor total do imóvel fica:"+velho.precoComDesconto());
            

        }
        

    }

}
