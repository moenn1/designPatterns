package Factory.Unite;

import java.util.ArrayList;

public class Unite {
    private String nom;

    private int coutConstruction;

    private int precisionAttaque;

    private int esquiveDefense;

    private ArrayList<String> equipements;

    public Unite(){
    }

    public Unite(String nom, int coutConstruction, int precisionAttaque, int esquiveDefense, ArrayList<String> equipements) {
        this.nom = nom;
        this.coutConstruction = coutConstruction;
        this.precisionAttaque = precisionAttaque;
        this.esquiveDefense = esquiveDefense;
        this.equipements = equipements;
    }

    public void consommerRessource(){
        System.out.println("Consommer ressource");
    }

    public void equiper(){
        System.out.println("Equiper: Unite");
    }


    @Override
    public String toString() {
        return getClass().toString();
    }
}
