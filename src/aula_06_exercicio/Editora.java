package aula_06_exercicio;

import java.util.ArrayList;

public class Editora {

    private String nome;
    private final ArrayList<Livro> livros;

    private Pessoa pessoa;

    public Editora(String nome, Pessoa pessoa) {
        this.nome = nome;
        this.livros = new ArrayList<Livro>();
        this.pessoa = pessoa;
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
        if(pessoa.getCpf() != 0) {
            this.livros.add(livro);
        } else {
            System.out.println("CPF invalido");
        }
    }

}
