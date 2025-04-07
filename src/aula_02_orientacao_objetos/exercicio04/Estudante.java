package aula_02_orientacao_objetos.exercicio04;

public class Estudante {
    private String nome;
    private double notaA;
    private double notaB;

    public Estudante() {}

    public Estudante(String nome, double notaA, double notaB) {
        this.nome = nome;
        this.notaA = notaA;
        this.notaB = notaB;
    }

    public double calcularMedia() {
        return (notaA + notaB) / 2;
    }

    public void exibeMedia() {
        double media = calcularMedia();
        System.out.println("Média do aluno " + nome + ": " + media);

        if (media >= 6 && media <= 10) {
            System.out.println("Aprovado");
        }
        else if (media >= 2 && media < 6) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
