package aula_00_exercicios_self.exercicio_01;

import java.util.ArrayList;
import java.util.List;

public class Jogos {
    private List<Jogo> listaJogos = new ArrayList<>();

    public void adicionarJogo(Jogo jogo) {
        listaJogos.add(jogo);
    }

    public void exibirJogos() {
        for (Jogo jogo : listaJogos) {
            System.out.println(jogo.getTitulo());
            System.out.println(jogo.getAno());
            System.out.println(jogo.getNota());
        }
    }
}
