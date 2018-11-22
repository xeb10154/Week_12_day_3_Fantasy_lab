package Players;

import Tools.Axe;
import Tools.IWeapon;

public abstract class Fighter implements IPlayer{

    private String name;
    protected int healthValue;
    protected int points = 0;

    public Fighter(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.points = points;
    }


    public int getHealthValue() {
        return this.healthValue;
    }


    public void changeHealth(int value) {
        this.healthValue += value;
    }




}
