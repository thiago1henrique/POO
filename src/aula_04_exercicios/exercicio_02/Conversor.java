package aula_04_exercicios.exercicio_02;

public class Conversor {
    private int horas;


    public Conversor(int horas) {
        this.horas = horas;
    }

    public void horasSegundos() {
        double calculo = this.horas * 3600;
        System.out.println("Conversão de " + horas + " em segundos deu: " + calculo);
    }

    public void horasMinutos() {
        double calculo = this.horas * 60;
        System.out.println("Conversão de " + horas + " em minutos deu: " + calculo);
    }
}
