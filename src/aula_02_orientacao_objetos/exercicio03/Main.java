package aula_02_orientacao_objetos.exercicio03;

public class Main {
    public static void main(String[] args) {
        RecebeNumero x = new RecebeNumero(10);
        System.out.println(x.getX());
        x.incrementar();
        x.incrementar();
        System.out.println(x.getX());
        x.decrementar();
        System.out.println(x.getX());
        x.multiplicaPorValorEspecifico(1);
    }
}
