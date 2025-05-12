package aula_06_exercicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Editora e1 = new Editora("Henrique");
        Livro a = new Livro("A Guerra dos Tronos", "R.R Martin", 1996, e1);
        System.out.println(a.getNomeEditora());

        e1.adicionarLivro(a);
        e1.listarLivros();
    }
}
