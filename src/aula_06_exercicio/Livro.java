package aula_06_exercicio;

public class Livro {
    private String titulo;
    private String autor;

    private boolean disponivel = true;
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

    public void emprestar() {
        if(disponivel) this.disponivel = false;
        else System.out.println("Livro fora de estoque.");
    }

    public void devolver() {
        if(!disponivel) this.disponivel = true;
        else System.out.println("Livro já em nosso estoque.");
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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
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
