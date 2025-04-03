package aula_02_orientacao_objetos.exercicio;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.print("A soma: ");
        System.out.println(calculadora.somar(10, 5));
        System.out.print("A subtração: ");
        System.out.println(calculadora.subtrair(10, 5));
        System.out.print("A multiplicação: ");
        System.out.println(calculadora.multiplicar(10, 5));
        System.out.print("A divisão: ");
        System.out.println(calculadora.dividir(10, 5));
    }


}
