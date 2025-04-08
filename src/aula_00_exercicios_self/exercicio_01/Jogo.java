package aula_00_exercicios_self.exercicio_01;

public class Jogo {
    private String titulo;
    private int ano;
    private double nota;

    public Jogo(String titulo, int ano, double nota) {
        this.titulo = titulo;
        this.ano = ano;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
