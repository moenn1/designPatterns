package Strategy;

import Strategy.combat.EspritCombatif;
import Strategy.deplacement.Deplacement;
import Strategy.soin.Soin;

public abstract class Personnage {
    protected EspritCombatif espritCombatif;

    protected Deplacement deplacement;

    protected Soin soin;

    public Personnage(){}

    public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
        this.espritCombatif = espritCombatif;
        this.deplacement = deplacement;
        this.soin = soin;
    }

    public void seDeplacer(){
        deplacement.deplacer();
    }

    public void combattre(){
        espritCombatif.combat();
    }

    public void soigner(){
        soin.soigne();
    }


    public EspritCombatif getCombat() {
        return espritCombatif;
    }

    public void setCombat(EspritCombatif combat) {
        this.espritCombatif = combat;
    }

    public Deplacement getDeplacement() {
        return deplacement;
    }

    public void setDeplacement(Deplacement deplacement) {
        this.deplacement = deplacement;
    }

    public Soin getSoin() {
        return soin;
    }

    public void setSoin(Soin soin) {
        this.soin = soin;
    }
}
