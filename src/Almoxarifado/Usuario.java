package Almoxarifado;

public abstract class Usuario {
    private String matricula;
    private String nome;
    private String senha;
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Usuario(String matricula, String nome, String senha){
        this.matricula = matricula;
        this.nome = nome;
        this.senha = senha;
    }
    
     public String toString(){
        return "Num.Matricula: "+this.matricula+" Nome: "+this.nome;

     }
}
     
