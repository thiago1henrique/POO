package aula_03_colecoes.aula;

public class AulaArray {
    public static void main(String[] args) {
        int[] vetor;
        vetor = new int[5];
        vetor[0] = 0;
        vetor[1] = 3;
        vetor[2] = 6;
        vetor[3] = 9;
        vetor[4] = 12;

        int[] vetor2 = {1,3,4,5,6};

        for(int i = 0; i <= vetor.length-1; i++) {
            System.out.println(vetor[i]);
        }

        for (int x : vetor2) {
            System.out.print(x + " ");
        }

    }
}
