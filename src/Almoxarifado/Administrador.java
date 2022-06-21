/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almoxarifado;

import java.util.ArrayList;

/**
 *
 * @author cefet
 */
public class Administrador extends Usuario {
 
    ArrayList<Usuario> contrato = new ArrayList();
        
    public Administrador(String matricula, String nome, String senha){
        super(matricula,nome,senha);   
    }
    
    public String toString(){
        System.out.println("Dados: "+super.getMatricula()+" "+super.getNome()+ "Cargo: Coordenador");
        for(int i=0;i<contrato.size();i++)
                System.out.println("Dados dos usuários: "+contrato.get(i));
        return "";
    }
    
   
}
