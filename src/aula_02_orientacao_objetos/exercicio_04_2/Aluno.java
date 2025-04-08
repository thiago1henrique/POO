package aula_02_orientacao_objetos.exercicio_04_2;

public class Aluno {
    private String nome;
    private double notaA;
    private double notaB;

    public Aluno(String nome, double notaA, double notaB) {
        this.nome = nome;
        this.notaA = notaA;
        this.notaB = notaB;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaA() {
        return notaA;
    }

    public double getNotaB() {
        return notaB;
    }
}
