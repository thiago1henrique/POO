package aula_01_introducao.aula02;

public class Veiculo {
    String modelo;
    boolean cambioAuto;
    String cor;
    int numeroRodas;
    double velocidade;

    Veiculo(){}

    Veiculo(String flex, boolean b, String verde, int i, int i1) {
        this.modelo = "";
        this.cambioAuto = false;
        this.cor = "";
        this.numeroRodas = 0;
        this.velocidade = 0;
    }

    public void acelerar(double valor) {
        velocidade += valor;
    }

    public void imprimirDados() {
        System.out.println("Cor " + this.cor);
        System.out.println("Número de rodas " + this.numeroRodas);
        System.out.println("Velocidade " + this.velocidade);
        System.out.println("Modelo " + this.modelo);
        System.out.println("É câmbio automático? " + this.cambioAuto);
    }

}
