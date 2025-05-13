package aula_07_heranca.exercicio;

public class Discente extends Pessoa{
    private String curso;

    public Discente(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
