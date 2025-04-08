package aula_02_orientacao_objetos.exercicio_04_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aprovado = 0;
        int reprovados = 0;
        int recuperacao = 0;
        int total = 0;
        double notasTotais = 0;

        while(true) {
            System.out.print("Bem vindo! Insira o nome do " + (total + 1) + " aluno. (digite SAIR para encerrar a operação) ");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Insira a primeira nota: ");
            double notaA = sc.nextDouble();
            sc.nextLine();

            System.out.print("Insira a segunda nota: ");
            double notaB = sc.nextDouble();
            sc.nextLine();

            total += 1;
            notasTotais = notaA + notaB;

            Aluno aluno = new Aluno(nome, notaA, notaB);

            double calculo = (aluno.getNotaA() + aluno.getNotaB()) / 2;
            if(calculo >= 6 && calculo <= 10) {
                System.out.println("Aprovado.");
                aprovado += 1;
            } else if (calculo < 6 && calculo >= 2) {
                System.out.println("Recuperação.");
                recuperacao += 1;
            } else {
                System.out.println("Reprovado.");
                reprovados += 1;
            }
        }

        System.out.println("\n");
        System.out.println("Média total da turma: " + notasTotais / total);
        System.out.println("Número total de aprovados: " + aprovado);
        System.out.println("Número total em recuperação: " + recuperacao);
        System.out.println("Número total reprovados: " + reprovados);
        System.out.println("Número total de alunos: " + total);

        sc.close();
    }
}
