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
