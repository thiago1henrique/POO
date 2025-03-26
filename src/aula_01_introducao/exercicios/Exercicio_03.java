package aula_01_introducao.exercicios;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a base do triangulo: ");
        double base = sc.nextDouble();

        System.out.print("Insira o altura do triangulo: ");
        double altura = sc.nextDouble();

        final int DIVISAO = 2;

        double calculo = (base * altura) / DIVISAO;

        System.out.println("A área do triangulo é: " + calculo);

        sc.close();
    }
}
