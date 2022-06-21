/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almoxarifado;

import java.util.Scanner;

/**
 *
 * @author cefet
 */
public class ProgramaAlmoxarifado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        
         //Administrador do almoxarifado
         Administrador a = new Administrador("123","Carlos wagner","321");
         
         //Usuários
         Professor p = new Professor("456","Bruno Chagas","000");
         Professor p1 = new Professor("789","Bruno Procacci","111");
         Tecnico t = new Tecnico("147","Saulo","222");
         Estagiario e = new Estagiario("128","Waly","333");
         
         //Itens
         Item i1 = new Item("1","lima",2);
         Item i2 = new Item("2","paquimetro",1);
         Item i3 = new Item("3","fresa",2);
         
         //Sistema
         Sistema s = new Sistema();
         
         
         //Adicionando usuários ao ArrayList
         System.out.println("Usuários foram adicionados ao ArrayList");
         s.adicionaUsuario(p, a);
         s.adicionaUsuario(p1, a);
         s.adicionaUsuario(t, a);
         s.adicionaUsuario(e, a);
         
         //Lista dos Usuários
         System.out.println(" ");
         s.lista(a);
         
         //Removendo usuário
         System.out.println(" ");
         System.out.println("Removendo usuário");
         s.removerUsuario(p1, a);
         
          //Lista dos Usuários
         System.out.println(" ");
         s.lista(a);
         
         //Menu
         int i=0;
         while(i!=4){
            System.out.println("#Digite 1 para adicionar Item. #Digite 2 para remover Item. #Digite 3 para devolver Item. #Digite 4 para sair");
            i = entrada.nextInt();
             System.out.println(" ");
            
            //Adicionando Itens
            if(i==1){
            System.out.println(" ");
            System.out.println("#Digite 1 para add Item i1. #Digite 2 para add Item i2. #Digite 3 para add Item i3.");
            int y = entrada.nextInt();
                switch(y){
                    case 1:
                         s.adicionar(i1, a);
                        break;
                    case 2:
                        s.adicionar(i2, a);
                        break;
                    case 3:
                        s.adicionar(i3, a);
                     break;
                }
        
            }
            

            //Removendo Itens
            if(i==2){
            System.out.println(" ");
            s.remover(i1, p);
            s.remover(i3, t);
            s.catalogo(a);
            }
            
            
            //Devolvendo Itens
            if(i==3){
            System.out.println(" ");
            s.devolver(i1, e);
            s.devolver(i3, e);
            s.catalogo(a);
            }
            
            
            
        }
        
        System.out.println("Você saiu do Sistema !!");
            
         

         
         
         
         
         
         
         
         
         
         
         
        
          
         
         
    }
    
}
