package aula_07_heranca.exercicio;

public class Main {
    public static void main(String[] args) {
        Docente d1 = new Docente("Eric", 35, "Programador");
        Discente d2 = new Discente("Thiago", 25, "Analise e Desenvolvimento de Sistemas");

        System.out.println(d2.getCurso());
    }
}
