package aula_06_exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bem vindo, por favor informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe seu CPF: ");
        int cpf = sc.nextInt();
        while (cpf <= 0) {
            System.out.print("CPF inválido. Informe seu CPF: ");
            cpf = sc.nextInt();
        }


        Pessoa thiago = new Pessoa("Thiago", 25, 0);
        Editora e1 = new Editora("Henrique", thiago);
        Livro a = new Livro("A Guerra dos Tronos", "R.R Martin", 1996, e1);
        System.out.println(a.getNomeEditora());

        e1.adicionarLivro(a);
    }
}
