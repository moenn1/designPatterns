package Strategy;

import Strategy.combat.EspritCombatif;
import Strategy.deplacement.Deplacement;
import Strategy.soin.PremierSoin;
import Strategy.soin.Soin;

public class Medecin extends Personnage {
    public Medecin() {
        this.soin = new PremierSoin();
    }

    public Medecin(EspritCombatif esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
    }
}