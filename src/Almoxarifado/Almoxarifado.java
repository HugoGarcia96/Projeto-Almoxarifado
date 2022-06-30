package Almoxarifado;
import java.util.ArrayList;

public class Almoxarifado {
    private String localizacao;
    ArrayList<Item> item = new ArrayList();
    
    public Almoxarifado(String localizacao){
        this.localizacao=localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
}
