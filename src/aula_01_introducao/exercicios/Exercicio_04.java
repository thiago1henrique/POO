package aula_01_introducao.exercicios;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor do raio: ");
        double raio = Math.pow(sc.nextDouble(), 2);

        double calculo = Math.PI * raio;

        System.out.println("A área da circuferência é: " + calculo);

        sc.close();
    }
}
