package Singleton;

public class CompteBancaire {

    private int numero;

    private double solde;

    private Journalisation journal;

    public CompteBancaire(int numero, double solde){
        this.numero = numero;
        this.solde = solde;
        this.journal = Journalisation.getInstance();
    }

    public boolean deposerArgent(double depot){
        if(depot>0) {
            this.solde += depot;
            journal.ajouterLog("Dépôt d'argent : +" + depot + " EUR (Solde : " + solde + " EUR)");
            return true;
        }
        journal.ajouterLog("Depot erreur, depot doit etre superieur a 0");
        return false;
    }

    public boolean retirerArgent(double retrait){
        if(retrait<solde) {
            this.solde -= retrait;
            journal.ajouterLog("Retrait d'argent : -" + retrait + " EUR (Solde : " + solde + " EUR)");
            return true;
        }
        journal.ajouterLog("Retrait erreur, solde insuffisant");
        return false;
    }


}
