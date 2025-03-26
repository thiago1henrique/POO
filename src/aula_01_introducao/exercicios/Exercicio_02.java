package aula_01_introducao.exercicios;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a altura: ");
        double altura = sc.nextDouble();

        System.out.print("Insira a largura: ");
        double largura = sc.nextDouble();

        System.out.print("Insira o comprimento: ");
        double comprimento = sc.nextDouble();

        double calculo = altura * largura * comprimento;

        System.out.println("O volume total é: " + calculo);

        sc.close();
    }
}
