package aula_00_exercicios_self.exercicio_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogos jogos = new Jogos();

        System.out.println("Sistema de notas jogos!");
        while(true) {
            System.out.print("Insira o nome do jogo (digite sair para sair): ");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Insira o ano do jogo: ");
            int ano = sc.nextInt();
            sc.nextLine();

            System.out.print("Insira a nota do jogo: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            Jogo jogo = new Jogo(nome, ano, nota);
            jogos.adicionarJogo(jogo);
        }

        jogos.exibirJogos();
        sc.close();
    }
}