package aula_09_interfaces;

public class Serie implements Reproduzivel, Favoritavel{
    private String nome;
    private int ano;
    private int numEpisodios;

    public Serie(String nome, int ano, int numEpisodios) {
        this.nome = nome;
        this.ano = ano;
        this.numEpisodios = numEpisodios;
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

    public int getNumEpisodios() {
        return numEpisodios;
    }

    public void setNumEpisodios(int numEpisodios) {
        this.numEpisodios = numEpisodios;
    }

    @Override
    public void Favoritavel() {
        System.out.println("Serie: " + this.nome + " favoritado...");
    }

    @Override
    public void Reproduzivel() {
        System.out.println("Serie: " + this.nome + " reproduzindo...");
    }

    @Override
    public String toString() {
        return nome + " " + ano + " " + numEpisodios;
    }
}
