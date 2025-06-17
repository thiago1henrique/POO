package aula_08_classes_abstratas.entities;

public class Aviao extends VeiculoAereo {
    private boolean decolou;
    private double altitude;

    public Aviao(boolean decolou, double altitude) {
        this.decolou = decolou;
        this.altitude = altitude;
    }

    public String toString(){
        return "Decolou o aviâo:" + this.decolou + "\nAltitude: " + this.altitude;
    }
}
