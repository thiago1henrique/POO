package aula_04_exercicios.exercicio_06;

public class Main {
    public static void main(String[] args) {
        Funcionario x = new Funcionario("Joseph", 51, 4000.00);
        Funcionario y = new Funcionario("Jotaro", 32, 600.00);
        Funcionario a = new Funcionario("Giorno", 18, 10000.00);
        Funcionario b = new Funcionario("Jonathan", 24, 0);
        Funcionario c = new Funcionario("Jolyne", 20, 200);

        Funcionario[] funcionarios = new Funcionario[5];
        funcionarios[0] = x;
        funcionarios[1] = y;
        funcionarios[2] = a;
        funcionarios[3] = b;
        funcionarios[4] = c;

        for(Funcionario i : funcionarios) {
            System.out.println(i.getNome());
        }
    }
}
