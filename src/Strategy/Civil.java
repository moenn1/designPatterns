package Strategy;

import Strategy.combat.*;
import Strategy.deplacement.Deplacement;
import Strategy.deplacement.Marcher;
import Strategy.soin.Soin;

public class Civil extends Personnage{
    public Civil() {
        this.deplacement = new Marcher();
    }
    public Civil(EspritCombatif esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
    }
}