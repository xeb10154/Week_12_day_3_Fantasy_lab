package Players;

import Tools.Axe;
import Tools.IWeapon;

public class Fighter {

    private String name;
    protected IWeapon weapon;
    protected int healthValue;
    protected int points = 0;

    public Fighter(String name, IWeapon weapon, int healthValue) {
        this.name = name;
        this.weapon = weapon;
        this.healthValue = healthValue;
        this.points = points;
    }


    public int getHealthValue() {
        return this.healthValue;
    }


    public void changeHealth(int value) {
        this.healthValue += value;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public IWeapon showWeapon() {
        return this.weapon;
    }
}
