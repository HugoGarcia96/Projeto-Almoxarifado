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
public class Estagiario extends Usuario{
    
    
    Scanner ler = new Scanner(System.in);
    public Estagiario(String matricula, String nome, String senha){
        super(matricula, nome, senha);
    }
    
    public String toString(){
        return "Num.Matricula: "+super.getMatricula()+" Nome: "+super.getNome()+" Cargo: Estagiário";
    }
    
}
    
   