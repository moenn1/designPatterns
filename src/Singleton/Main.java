package Singleton;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire(123456789, 0);
        CompteBancaire compte2 = new CompteBancaire(987654321, 0);
        compte1.deposerArgent(100);
        compte1.retirerArgent(80);
        compte2.retirerArgent(10);
        Journalisation journal = Journalisation.getInstance();
        journal.afficherLog();
    }
}
