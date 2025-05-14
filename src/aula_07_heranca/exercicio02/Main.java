package aula_07_heranca.exercicio02;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        Automovel v2 = new Automovel();
        Motocicleta v3 = new Motocicleta();
        Bicicleta v4 = new Bicicleta();

        System.out.println(v1.calcularPrecoCorrida(10, 20));
        System.out.println(v2.calcularPrecoCorrida(10, 20));
        System.out.println(v3.calcularPrecoCorrida(10, 30));
        System.out.println(v4.calcularPrecoCorrida(10));
    }
}
