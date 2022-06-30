package Almoxarifado;

public class Tecnico extends Usuario {
    Almoxarifado a = new Almoxarifado("");
    
    public Tecnico(String matricula, String nome, String senha){
        super(matricula, nome, senha);
    }
    
    public String toString(){
        return "Num.Matricula: "+super.getMatricula()+" Nome: "+super.getNome()+ " Cargo: Tecnico";
    } 
    
}
