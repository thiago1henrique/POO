package aula_01_introducao.aula02;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo();

        Veiculo carro2 = new Veiculo("flex", true, "verde", 4, 180);

        carro1.modelo = "Esportivo";
        carro1.cor = "Preto";
        carro1.numeroRodas = 4;
        carro1.velocidade = 0;
        carro1.cambioAuto = true;


        carro1.acelerar(25);
        carro1.imprimirDados();

    }
}
