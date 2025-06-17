package aula_09_interfaces;

public class Podcast implements Compartilhavel, Reproduzivel{

    private String nome;
    private int numeroEpisodio;

    public Podcast(String nome, int numeroEpisodio) {
        this.nome = nome;
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    @Override
    public void Compartilhavel(String redeSocial) {
        System.out.println("Podcast: " + this.nome + " favoritado...");
    }

    @Override
    public void Reproduzivel() {
        System.out.println("Podcast: " + this.nome + " reproduzindo...");
    }
}
