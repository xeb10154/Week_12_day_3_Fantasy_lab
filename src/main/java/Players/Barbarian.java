package Players;

import Rooms.IChallenge;
import Tools.IWeapon;

public class Barbarian extends Melee {

    public Barbarian(String name, int healthValue, IWeapon weapon) {
        super(name, healthValue, weapon);
    }

    public String cuttingHair(){
        return "I need a haircut. Badly.";
    }

    public void collectPoints(IChallenge room) {
        this.points += 5;
    }
}
