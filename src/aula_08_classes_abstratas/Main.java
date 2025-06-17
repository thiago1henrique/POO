package aula_08_classes_abstratas;

import aula_08_classes_abstratas.entities.Aviao;

public class Main {
    public static void main(String[] args) {
        Aviao boing = new Aviao(true, 999);
        System.out.println(boing);
    }
}
