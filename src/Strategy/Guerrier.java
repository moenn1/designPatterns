package Strategy;

import Strategy.combat.CombatPistolet;
import Strategy.combat.EspritCombatif;
import Strategy.deplacement.Deplacement;
import Strategy.soin.Soin;

public class Guerrier extends Personnage {
    public Guerrier(){
        this.espritCombatif = new CombatPistolet();
    }
    public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
    }
}

