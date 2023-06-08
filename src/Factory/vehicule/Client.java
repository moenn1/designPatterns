package Factory.vehicule;

public class Client {
    VehiculeFactory pVehicule;

    public Client(){
        pVehicule = new VehiculeFactory();
    }

    public Vehicule formerVehicule(VehiculeType type){
        return pVehicule.createVehicule(type);
    }

    public static void main(String[] args) {
        Client pClient = new Client();
        pClient.formerVehicule(VehiculeType.VT_DeuxRoue).afficherVehicule();
        Client pClient1 = new Client();
        pClient1.formerVehicule(VehiculeType.VT_TroisRoue).afficherVehicule();
        Client pClient2 = new Client();
        pClient2.formerVehicule(VehiculeType.VT_QuatreRoue).afficherVehicule();


    }

}
