package aula_06_exercicio;

public class Livro {
    private String titulo;
    private String autor;
    private Editora editora;

    private int ano;

    public Livro(String titulo, String autor, int ano, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    public String getNomeEditora() {
        if (this.editora != null) {
            return this.editora.getNome();
        }
        return "Editora não informada";
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String nomeEditora() {
        return editora.getNome();
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
