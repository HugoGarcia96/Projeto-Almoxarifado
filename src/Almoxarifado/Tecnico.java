/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almoxarifado;

/**
 *
 * @author cefet
 */
public class Tecnico extends Usuario {
    Almoxarifado a = new Almoxarifado("");
    
    public Tecnico(String matricula, String nome, String senha){
        super(matricula, nome, senha);
    }
    
    public String toString(){
        return "Num.Matricula: "+super.getMatricula()+" Nome: "+super.getNome()+ " Cargo: Tecnico";
    } 
    
}
