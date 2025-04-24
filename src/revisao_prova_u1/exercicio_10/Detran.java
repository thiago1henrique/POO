package revisao_prova_u1.exercicio_10;

public class Detran {
    private int velocidadeMaxima;
    private int velocidadeVeiculo;

    public Detran(int velocidadeMaxima, int velocidadeVeiculo) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeVeiculo = velocidadeVeiculo;
    }

    public void calcularMulta() {
        int vintePorcento = velocidadeMaxima * 20 / 100;
        int cinquentaPorcento = velocidadeMaxima * 50 / 100;
        int velocidadeExcedente = velocidadeVeiculo - velocidadeMaxima;

        if(velocidadeVeiculo <= velocidadeMaxima) {
            System.out.println("Sem multa");
        }
        else if(velocidadeExcedente <= vintePorcento) {
            System.out.println("Multa média: R$130,16");
        }
        else if(velocidadeExcedente <= cinquentaPorcento) {
            System.out.println("Multa grave: R$195,23");
        }
        else {
            System.out.println("Multa gravíssima: R$880,41");
        }
    }
}
