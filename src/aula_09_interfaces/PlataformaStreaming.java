package aula_09_interfaces;

public class PlataformaStreaming {

    public void reproduzirMidia(Reproduzivel conteudo) {
        System.out.println("Reproduzindo: " + conteudo);
    }

    public void favoritarMidia(Favoritavel conteudo) {
        System.out.println("Favoritando " + conteudo);
    }

    public void compartilharMidia(Compartilhavel conteudo, String redeSocial) {
        System.out.println(conteudo + " " + redeSocial);
    }
}
