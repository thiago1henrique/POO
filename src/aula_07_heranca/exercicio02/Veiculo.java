package aula_07_heranca.exercicio02;

public class Veiculo {
    private String codigo;
    private String modelo;

    public double calcularPrecoCorrida(int distancia, int tempo) {
        double valorBase = 4.5;
        return valorBase + distancia*1.5 + tempo*0.3;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
