package aula_01_introducao.aula02.exercicio;

public class Jogos {
    String nome;
    int ano;
    String developer;

    public void exibeInfos() {
        System.out.println("Nome do jogos: " + this.nome);
        System.out.println("Ano de lançamento: " + this.ano);
        System.out.println("Developer: " + this.developer);
    }

    public void review(String review) {
        System.out.println("A minha review é: " + review);
    }

    public Jogos(String nome, int ano, String developer) {
        this.nome = nome;
        this.ano = ano;
        this.developer = developer;
    }
}
