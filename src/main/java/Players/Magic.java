package Players;

import Tools.ISpell;

public abstract class Magic extends Fighter implements IDamageAndHeal{

    protected ISpell spell;

    public Magic(String name, int healthValue, ISpell spell) {
        super(name, healthValue);
        this.spell = spell;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void casting(IDamageAndHeal player){
        player.takeDamage(spell.power());
    }


    public void takeDamage(int damage) {
        this.healthValue -= damage;

    }

    public void heal(int drug) {
        this.healthValue += drug;
    }


}
