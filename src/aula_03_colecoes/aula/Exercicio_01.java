package aula_03_colecoes.aula;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] elementos = new String[4];

        for (int x = 0; x <= elementos.length-1; x++) {
            System.out.println("Insira o " + (x + 1) + "° valor");
            String valor = sc.nextLine();
            elementos[x] = valor;
        }

        System.out.println("Valores inseridos:");
        for (String a : elementos) {
            System.out.print(a + " ");
        }

        
    }
}
