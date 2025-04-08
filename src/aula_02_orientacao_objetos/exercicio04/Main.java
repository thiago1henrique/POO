package aula_02_orientacao_objetos.exercicio04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();

        System.out.println("Cadastro de Estudantes (digite 'sair' no nome para encerrar)");

        while (true) {
            System.out.print("\nNome do estudante: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Nota A: ");
            double notaA = scanner.nextDouble();

            System.out.print("Nota B: ");
            double notaB = scanner.nextDouble();

            scanner.nextLine();

            Estudante estudante = new Estudante(nome, notaA, notaB);
            turma.adicionarEstudante(estudante);

            estudante.exibeMedia();
        }

        turma.exibirRelatorioTurma();

        scanner.close();
    }
}
