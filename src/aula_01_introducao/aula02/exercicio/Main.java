package aula_01_introducao.aula02.exercicio;

public class Main {
    public static void main(String[] args) {
        Jogos darkSouls = new Jogos("Dark Souls", 2011, "From Software");
        darkSouls.exibeInfos();
        darkSouls.review("Certamente um jogo");

        System.out.println(args[0]);
    }

}
