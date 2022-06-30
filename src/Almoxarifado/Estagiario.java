package Almoxarifado;
import java.util.Scanner;

public class Estagiario extends Usuario{
     
    Scanner ler = new Scanner(System.in);
    public Estagiario(String matricula, String nome, String senha){
        super(matricula, nome, senha);
    }
    
    public String toString(){
        return "Num.Matricula: "+super.getMatricula()+" Nome: "+super.getNome()+" Cargo: Estagiário";
    }
    
}
    
   