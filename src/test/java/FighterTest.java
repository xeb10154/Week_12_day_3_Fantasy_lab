import Players.Fighter;
import Tools.Axe;
import Tools.IWeapon;
import Tools.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter fighter;
    IWeapon sword;
    Axe axe;

    @Before

    public void setUp() throws Exception {
        sword = new Sword();
        axe = new Axe();
        fighter = new Fighter("Raymond", sword, 100);
    }

    @Test
    public void checkHealthValue() {
        assertEquals(100, fighter.getHealthValue());
    }

    @Test
    public void testChangeHealth() {
        fighter.changeHealth(10);
        assertEquals(110, fighter.getHealthValue());
    }

    @Test
    public void showWeapon() {
        assertEquals(sword, fighter.showWeapon());
    }

    @Test
    public void setWeapon(){
        fighter.setWeapon(axe);
        assertEquals(axe, fighter.showWeapon());
    }


}
