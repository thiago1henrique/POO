package aula_07_heranca.exercicio02;

public class Motocicleta extends Veiculo {
    @Override
    public double calcularPrecoCorrida(int distancia, int tempo) {
        return distancia*1.5 + tempo*0.3;
    }
}
