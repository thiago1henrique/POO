package revisao_prova_u1.exercicio_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[2];

        int contador = 0;
        double salarioTotal = 0;

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

            Funcionario x = new Funcionario(nome, idade, salario);
            funcionarios[contador] = x;
            contador += 1;
        }

        for(Funcionario i : funcionarios) {
            salarioTotal += i.getSalario();
        }

        System.out.println("Números de funcionários: " + contador);
        System.out.println("Média de salário: " + salarioTotal / contador);
    }
}
