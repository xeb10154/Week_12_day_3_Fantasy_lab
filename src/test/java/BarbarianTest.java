import Players.Barbarian;
import Players.Dwarf;
import Tools.Axe;
import Tools.IWeapon;
import Tools.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    IWeapon sword;
    Axe axe;

    @Before

    public void setUp() throws Exception {
        sword = new Sword();
        axe = new Axe();
        barbarian = new Barbarian("Raymond", 100, sword);
    }

    @Test
    public void checkHealthValue() {
        assertEquals(100, barbarian.getHealthValue());
    }

    @Test
    public void testChangeHealth() {
        barbarian.changeHealth(10);
        assertEquals(110, barbarian.getHealthValue());
    }

    @Test
    public void showWeapon() {
        assertEquals(sword, barbarian.showWeapon());
    }

    @Test
    public void setWeapon(){
        barbarian.setWeapon(axe);
        assertEquals(axe, barbarian.showWeapon());
    }

    @Test
    public void testTakeDamage(){
        barbarian.takeDamage(10);
        assertEquals(90, barbarian.getHealthValue());

    }

    @Test
    public void checkHaircutStatus() {
        assertEquals("I need a haircut. Badly.", barbarian.cuttingHair());
    }
}