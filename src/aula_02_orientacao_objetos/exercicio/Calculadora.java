package aula_02_orientacao_objetos.exercicio;

public class Calculadora {
    private double valorUm;
    private double valorDois;

    public double getValorUm() {
        return valorUm;
    }

    public void setValorUm(double valorUm) {
        this.valorUm = valorUm;
    }

    public double getValorDois() {
        return valorDois;
    }

    public void setValorDois(double valorDois) {
        this.valorDois = valorDois;
    }

    public double somar(int a, int b) {
        this.valorUm = a;
        this.valorDois = b;
        return this.valorUm + this.valorDois;
    }

    public double subtrair(int a, int b) {
        this.valorUm = a;
        this.valorDois = b;
        return this.valorUm - this.valorDois;
    }

    public double multiplicar(int a, int b) {
        this.valorUm = a;
        this.valorDois = b;
        return this.valorUm * this.valorDois;
    }

    public double dividir(int a, int b) {
        this.valorUm = a;
        this.valorDois = b;
        return this.valorUm / this.valorDois;
    }
}
