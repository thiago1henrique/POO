package aula_02_orientacao_objetos.exercicio02;

public class Atletas {
    private String nome;
    private String esporte;
    private int qtdMedalhas;

    public Atletas() {}

    public Atletas(String nome, String esporte, int qtdMedalhas) {
        this.nome = nome;
        this.esporte = esporte;
        this.qtdMedalhas = qtdMedalhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public int getQtdMedalhas() {
        return qtdMedalhas;
    }

    public void setQtdMedalhas(int qtdMedalhas) {
        this.qtdMedalhas = qtdMedalhas;
    }

    public void addMedalhas() {
        this.qtdMedalhas += 1;
    }

    public void removeMedalhas() {
        if (this.qtdMedalhas == 0) {
            System.out.println("Não é possivel decrementar mais.");
        } else {
            this.qtdMedalhas -= 1;
        }
    }
}
