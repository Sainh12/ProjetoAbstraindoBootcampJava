package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    //=======================================Atributos========================================
    private int cargahoraria;

    public Curso(){}

    //==================================Getters and Setters===================================
    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    //========================================Métodos=========================================
    @Override
    public double calcularXp(){
        return xp_padrao*cargahoraria;
    }

    //---------------------------------------------------------
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }
}
