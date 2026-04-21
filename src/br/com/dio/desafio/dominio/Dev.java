package br.com.dio.desafio.dominio;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Dev {

    //=======================================Atributos========================================
    private String nome;
    private Set<Conteudo> conteudoinscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoconcluido= new LinkedHashSet<>();

    //==================================Getters and Setters===================================
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoinscritos() {
        return conteudoinscritos;
    }

    public void setConteudoinscritos(Set<Conteudo> conteudoinscritos) {
        this.conteudoinscritos = conteudoinscritos;
    }

    public Set<Conteudo> getConteudoconcluido() {
        return conteudoconcluido;
    }

    public void setConteudoconcluido(Set<Conteudo> conteudoconcluido) {
        this.conteudoconcluido = conteudoconcluido;
    }
    //========================================Métodos=========================================
    public void increverBootcamp (Bootcamp bootcamp){
        this.conteudoinscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscrito().add(this);
    }

    //---------------------------------------------------------------------
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoinscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudoconcluido.add(conteudo.get());
            this.conteudoinscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não esta matriculado em nenhum conteúdo.");
        }
    }

    //---------------------------------------------------------------------
    public double calcularTotalXp(){
        return this.conteudoconcluido
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    //---------------------------------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoinscritos, dev.conteudoinscritos) && Objects.equals(conteudoconcluido, dev.conteudoconcluido);
    }

    //----------------------------------------------------------------------
    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoinscritos, conteudoconcluido);
    }

    //-----------------------------------------------------------------------
}
