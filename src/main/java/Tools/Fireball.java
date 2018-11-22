package Tools;

import Players.IDamageAndHeal;

public class Fireball implements ISpell{

    private int power = 50;

    public void casting(IDamageAndHeal player) {
    this.power = power;
    }

    public int power() {
        return this.power;
    }
}
