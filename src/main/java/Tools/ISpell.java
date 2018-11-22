package Tools;

import Players.IDamageAndHeal;

public interface ISpell {

    void casting(IDamageAndHeal player);

    int power();
}
