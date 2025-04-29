package revisao_prova_u1.exercicio_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gabarito x = new Gabarito();
        int corretas = 0;
        int erradas = 0;
        int contador = 0;

        while (contador < x.getResposta().length) {
            System.out.println("Digite a resposta da questão " + (contador + 1) + ":");
            String respostaUsuario = sc.nextLine().toUpperCase();

            if (respostaUsuario.equals(x.getResposta()[contador])) {
                corretas++;
            } else {
                erradas++;
            }

            contador++;
        }

        System.out.println("Respostas corretas: " + corretas);
        System.out.println("Respostas erradas: " + erradas);

        sc.close();
    }
}