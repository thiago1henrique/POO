package aula_09_interfaces;

public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme("Missâo Impossivel: Acerto final", 2025, "Christopher McQuarrie");
        Serie s1 = new Serie("Severance", 2022, 17);
        PlataformaStreaming p1 = new PlataformaStreaming();

        p1.compartilharMidia(f1, "Twitter");
        p1.favoritarMidia(f1);
        p1.reproduzirMidia(f1);

        p1.reproduzirMidia(s1);
        //p1.compartilharMidia(s1, "Instagram"); erro
    }
}
