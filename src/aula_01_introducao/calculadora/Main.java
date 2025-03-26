package aula_01_introducao.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Insira o segundo número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma foi: " + soma);

        sc.close();
    }
}
