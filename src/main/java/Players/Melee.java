package Players;

import Tools.IWeapon;

public abstract class Melee extends Fighter implements IDamageAndHeal{

    protected IWeapon weapon;

    public Melee(String name, int healthValue, IWeapon weapon) {
        super(name, healthValue);
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public IWeapon showWeapon() {
        return this.weapon;
    }


    public void takeDamage(int damage) {
        this.healthValue -= damage;
    }

    public void heal(int drug) {

    }


}
