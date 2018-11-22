import Players.Dwarf;
import Players.Fighter;
import Tools.Axe;
import Tools.IWeapon;
import Tools.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    IWeapon sword;
    Axe axe;

    @Before

    public void setUp() throws Exception {
        sword = new Sword();
        axe = new Axe();
        dwarf= new Dwarf("Raymond",100, sword);
    }

    @Test
    public void checkHealthValue() {
        assertEquals(100, dwarf.getHealthValue());
    }

    @Test
    public void testChangeHealth() {
        dwarf.changeHealth(10);
        assertEquals(110, dwarf.getHealthValue());
    }

    @Test
    public void showWeapon() {
        assertEquals(sword, dwarf.showWeapon());
    }

    @Test
    public void setWeapon(){
        dwarf.setWeapon(axe);
        assertEquals(axe, dwarf.showWeapon());
    }

    @Test
    public void needToLoseWeight(){
        assertEquals("I need to lose weight.", dwarf.needToLoseWeight());
    }


}
