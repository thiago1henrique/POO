package aula_09_interfaces;

public class Filme implements Reproduzivel, Compartilhavel, Favoritavel{
    private String nome;
    private int ano;
    private String diretor;

    public Filme(String nome, int ano, String diretor) {
        this.nome = nome;
        this.ano = ano;
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void Compartilhavel(String redeSocial) {
        System.out.println("Filme " + this.nome + " " + this.ano + " " + this.diretor + " compartilhada em: " + redeSocial);
    }

    @Override
    public void Favoritavel() {
        System.out.println("Filme " + this.nome + " favoritado...");
    }

    @Override
    public void Reproduzivel() {
        System.out.println("Filme " + this.nome + " reproduzindo...");
    }

    @Override
    public String toString() {
        return "Filme: " + nome + ", ano: " + ano + ", diretor: " + diretor;
    }
}
