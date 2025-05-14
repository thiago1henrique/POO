package aula_06_exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro l2 = null;
        Editora e1 = null;

        System.out.print("Bem vindo, por favor informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe seu CPF: ");
        String cpf = sc.nextLine();
        while (cpf.length() <= 0) {
            System.out.print("CPF inválido. Informe seu CPF: ");
            cpf = sc.nextLine();
        }

        Pessoa p1 = new Pessoa(nome, 0, Integer.parseInt(cpf));

        while(true) {
            System.out.printf("Olá %s, digite\n 1 para inserir um livro \n 2 para listar livros \n 3 para sair: ", p1.getNome());
            String opcao = sc.nextLine();

            if(opcao.equals("1")) {
                System.out.print("Insira o nome do livro: ");
                String nomeLivro = sc.nextLine();

                System.out.print("Autor: ");
                String autorLivro = sc.nextLine();

                System.out.print("Ano: ");
                String anoLivro = sc.nextLine();

                System.out.print("Editora: ");
                String editoraLivro = sc.nextLine();


                if (e1 == null) {
                    e1 = new Editora(editoraLivro, p1);
                }

                l2 = new Livro(nomeLivro, autorLivro, Integer.parseInt(anoLivro), e1);
                e1.adicionarLivro(l2);
            } else if (opcao.equals("2")) {
                if (e1 != null) {
                    e1.listarLivros();
                } else {
                    System.out.println("Nenhuma editora/livro cadastrado ainda!");
                }
            } else if (opcao.equals("3")) {
                System.out.println("Saindo...");
                break;
            }
        }
        sc.close();
    }
}
