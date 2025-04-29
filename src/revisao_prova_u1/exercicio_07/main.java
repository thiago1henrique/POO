package revisao_prova_u1.exercicio_07;

import aula_04_exercicios.exercicio_07.Funcionario;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        aula_04_exercicios.exercicio_07.Funcionario[] funcionarios = new aula_04_exercicios.exercicio_07.Funcionario[1];

        int contador = 0;

        while(contador <= funcionarios.length-1) {
            System.out.print("Digite SAIR para finalizar - Insira o nome do funcionário:");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Insira a idade do funcionário:");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Insira o salário do funcionário:");
            double salario = sc.nextDouble();
            sc.nextLine();

            aula_04_exercicios.exercicio_07.Funcionario x = new aula_04_exercicios.exercicio_07.Funcionario(nome, idade, salario);
            funcionarios[contador] = x;
            contador += 1;
        }

        for(Funcionario i : funcionarios) {
            System.out.println(i.getNome());
        }
    }
}
