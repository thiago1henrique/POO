package aula_02_orientacao_objetos.exercicio03;

public class RecebeNumero {
    private double x;

    public RecebeNumero(){}

    public RecebeNumero(int x) { this.x = x; }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void incrementar() { this.x += 1; }
    public void decrementar() { this.x -= 1; }
    public double multiplicaPorValorEspecifico(double y)  {
        System.out.println(this.x * y);
        return this.x * y;
    }
}
