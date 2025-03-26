package aula_01_introducao.exercicios;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu primeiro nome: ");
        String nome = sc.nextLine();

        System.out.print("Insira seu segundo nome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Seu nome e sobrenome é: " + nome + " " + sobrenome);

        sc.close();
    }
}
