package Factory.Unite;

public class UniteFactory {
    public Unite creerUnite(TypeUnite type){
        if (type.equals(TypeUnite.SoldatHumain))
            return new SoldatHumain();
        else if (type.equals(TypeUnite.CommandantHumain))
            return new CommandantHumain();
        else
            return new Unite();
    }
}
