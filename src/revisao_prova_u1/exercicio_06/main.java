package revisao_prova_u1.exercicio_06;

public class main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];

        System.out.println(funcionarios.length);
        funcionarios[0] = new Funcionario("Thiago", 123, 999);
        funcionarios[1] = new Funcionario("Maria", 456, 1000);
        funcionarios[2] = new Funcionario("Paulo", 456, 1000);
        funcionarios[3] = new Funcionario("Pedro", 456, 1000);
        funcionarios[4] = new Funcionario("Jose", 456, 1000);
    }
}
