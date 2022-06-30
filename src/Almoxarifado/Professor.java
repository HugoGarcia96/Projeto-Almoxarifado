package Almoxarifado;

public class Professor extends Usuario {
      
    public Professor(String matricula, String nome, String senha){
         super(matricula, nome, senha);
    }
    
    public String toString(){
        return "Num.Matricula: "+super.getMatricula()+" Nome: "+super.getNome()+ " Cargo:Professor";
    }
    
}
