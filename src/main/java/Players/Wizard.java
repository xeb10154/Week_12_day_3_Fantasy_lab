package Players;

import Rooms.IChallenge;
import Tools.ISpell;

public class Wizard extends Magic {

    public Wizard(String name, int healthValue, ISpell spell) {
        super(name, healthValue, spell);
    }


    public void collectPoints(IChallenge room) {
        this.points += 5;
    }
}
