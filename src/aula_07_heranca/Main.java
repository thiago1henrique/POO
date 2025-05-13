package aula_07_heranca;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        VeiculoTerrestre v2 = new VeiculoTerrestre();
        VeiculoAereo v3 = new VeiculoAereo();
        Automovel v4 = new Automovel();

        System.out.println(v1 instanceof Veiculo);
        System.out.println(v2 instanceof Veiculo);

        v1.setMarca("BMW");
        v2.setMarca("Ford");
        v3.setMarca("Boing");
        v3.setMarca("Fiat");

        System.out.println(v1.getMarca());
        System.out.println(v2.getMarca());
        v2.setNumRodas(4);

        System.out.println("Número de rodas: /" +v2.getNumRodas());

        v3.setAltitude(10000);
        System.out.println("Altitude: " +v3.getAltitude());

        v4.setNumPortas(4);
        System.out.println("Número de portas: " + v4.getNumPortas());
    }
}
