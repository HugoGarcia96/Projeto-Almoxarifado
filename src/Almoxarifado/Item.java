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
public class Item {
    private String codigo;
    private String nome;
    private int qtdeItem;
    
    
    public Item(String codigo, String nome, int qtdeItem){
        this.codigo=codigo;
        this.nome=nome;
        this.qtdeItem=qtdeItem;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeItem() {
        return qtdeItem;
    }

    public void setQtdeItem(int qtdeItem) {
        this.qtdeItem = qtdeItem;
    }
    
    public String toString(){
        return "Dados do Item: "+"cod: "+this.codigo+" nome: "+this.nome+" quant: "+this.qtdeItem;
    } 
    
}
