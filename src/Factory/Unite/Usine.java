package Factory.Unite;


public class Usine {

    UniteFactory pUnit = new UniteFactory();

    public Unite formerUnite(TypeUnite type){
        return pUnit.creerUnite(type);
    }

    public static void main(String[] args) {
        Usine usine = new Usine();
        Unite unite = usine.formerUnite(TypeUnite.SoldatHumain);
        System.out.println(unite);
    }
}
