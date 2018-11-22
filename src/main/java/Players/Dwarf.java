package Players;

import Rooms.IChallenge;
import Tools.IWeapon;

public class Dwarf extends Melee {

    public Dwarf(String name, int healthValue, IWeapon weapon) {
        super(name, healthValue, weapon);
    }

    public void takeDamage(int damage) {
        this.healthValue -= damage;

    }

    public void heal(int drug) {
        this.healthValue += drug;
    }

    public String needToLoseWeight(){
        return "I need to lose weight.";
    }

    public void collectPoints(IChallenge room) {
        this.points += 5;
    }

}
