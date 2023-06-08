package Singleton;

//Lazy build
public class Journalisation {
    private static Journalisation uniqueInstance;

    private String log;

    private Journalisation() {
        this.log = "";
    }

    public static Journalisation getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Journalisation();
        }
        return uniqueInstance;
    }

    public void ajouterLog(String log){
        this.log += log + "\n";
    }

    public void afficherLog(){
        System.out.println(this.log);
    }

}
