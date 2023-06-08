package Factory.vehicule;

public class VehiculeFactory {

    public Vehicule createVehicule(VehiculeType type){
        if (type.equals(VehiculeType.VT_DeuxRoue)){
            return new DeuxRoue();
        } else if (type.equals(VehiculeType.VT_TroisRoue)) {
            return new TroisRoue();
        } else if (type.equals(VehiculeType.VT_QuatreRoue)) {
            return new QuatreRoue();
        }else
            return new Vehicule();
    }
}
