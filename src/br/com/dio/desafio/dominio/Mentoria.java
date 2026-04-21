package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    //=======================================Atributos========================================
    private LocalDate data;

    public Mentoria (){}

    //==================================Getters and Setters===================================
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //========================================Métodos=========================================
    @Override
    public double calcularXp(){
        return xp_padrao + 20;
    }

    //-----------------------------------------------------
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getDescricao() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
