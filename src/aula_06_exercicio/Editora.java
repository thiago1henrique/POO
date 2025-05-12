package aula_06_exercicio;

import java.util.ArrayList;

public class Editora {

    private String nome;
    private final ArrayList<Livro> livros;

    public Editora(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<Livro>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void listarLivros() {
        System.out.println("Listando livros");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

}
