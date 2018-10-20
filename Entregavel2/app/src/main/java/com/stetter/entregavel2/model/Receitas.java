package com.stetter.entregavel2.model;

public class Receitas {

    private String nome;
    private String descrição;
    private int tempoPreparo;

    public Receitas(String nome, String descrição, int tempoPreparo) {
        this.nome = nome;
        this.descrição = descrição;
        this.tempoPreparo = tempoPreparo;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }


}
