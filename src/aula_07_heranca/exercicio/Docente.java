package aula_07_heranca.exercicio;

public class Docente extends Pessoa{

    private String areaAtuacao;

    public Docente(String nome, int idade, String areaAtuacao) {
        super(nome, idade);
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
}
