package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

	private int cargaHoraria;

    public Curso() {
        super(); // chamando o construtor da classe pai (Conteudo)
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}