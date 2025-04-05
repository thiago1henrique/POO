package aula_02_orientacao_objetos.exercicio02;

public class Main {
    public static void main(String[] args) {
        Atletas participanteUm = new Atletas("Thiago", "Futebol", 10);

        System.out.println(participanteUm.getQtdMedalhas());
        participanteUm.setQtdMedalhas(1);
        System.out.println(participanteUm.getQtdMedalhas());
        participanteUm.removeMedalhas();
        participanteUm.removeMedalhas();
    }
}
