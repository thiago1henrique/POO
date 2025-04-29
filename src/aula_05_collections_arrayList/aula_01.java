package aula_05_collections_arrayList;

import java.util.ArrayList;

public class aula_01 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Teste 1");
        lista.add("Teste 2");

        String texto = "Teste 3";
        lista.add(texto);

        System.out.println(lista.get(2));
        System.out.println(lista.remove(1));
        System.out.println(lista.get(1));
        System.out.println(lista);

        lista.clear();

        System.out.println(lista);
    }
}
