package aula_05_collections_arrayList.exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        System.out.println("Bem vindo!");

        int contador = 0;

        while(true){
            System.out.println("Insira o " + (contador + 1) + " funcionário");

            String nome = sc.nextLine();

            int idade = sc.nextInt();
            sc.nextLine();

            double salario = sc.nextDouble();
            sc.nextLine();

            Funcionario funcionario = new Funcionario(nome, idade, salario);
            funcionarios.add(funcionario);

            contador++;

            if(contador > 1){
                System.out.println("Deseja continuar? (S/N)");
                String resposta = sc.nextLine();
                if(resposta.equalsIgnoreCase("N")){
                    break;
                }
            }
        }
    }
}
