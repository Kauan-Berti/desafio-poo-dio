package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    //Atributos
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Metodo para calcular o XP, implementado nas classes filhas
    public abstract double calcularXp();
}
