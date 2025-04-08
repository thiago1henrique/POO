package aula_02_orientacao_objetos.exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Estudante> estudantes;

    public Turma() {
        estudantes = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public double calcularMediaGeral() {
        if (estudantes.isEmpty()) {
            return 0;
        }

        double soma = 0;
        for (Estudante e : estudantes) {
            soma += e.calcularMedia();
        }
        return soma / estudantes.size();
    }

    public int getTotalEstudantes() {
        return estudantes.size();
    }

    public int getTotalAprovados() {
        int count = 0;
        for (Estudante e : estudantes) {
            if (e.calcularMedia() >= 6) {
                count++;
            }
        }
        return count;
    }

    public int getTotalRecuperacao() {
        int count = 0;
        for (Estudante e : estudantes) {
            double media = e.calcularMedia();
            if (media >= 2 && media < 6) {
                count++;
            }
        }
        return count;
    }

    public int getTotalReprovados() {
        int count = 0;
        for (Estudante e : estudantes) {
            if (e.calcularMedia() < 2) {
                count++;
            }
        }
        return count;
    }

    public void exibirRelatorioTurma() {
        System.out.println("\nRELATÓRIO DA TURMA");
        System.out.println("Total de estudantes: " + getTotalEstudantes());
        System.out.println("Média geral da turma: " + calcularMediaGeral());
        System.out.println("Aprovados: " + getTotalAprovados());
        System.out.println("Em recuperação: " + getTotalRecuperacao());
        System.out.println("Reprovados: " + getTotalReprovados());
    }
}
