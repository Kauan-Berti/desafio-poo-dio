package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    //Atributos
    private int cargaHoraria;

    //Construtor sem parâmetros
    public Curso() {

    }
    //Getters e Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Implementação do método calcularXp
    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }

    // Método toString
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
