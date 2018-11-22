import Players.Dwarf;
import Players.Wizard;
import Tools.Fireball;
import Tools.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Fireball fireball;
    Dwarf dwarf;
    Sword sword;

    @Before
    public void setUp() throws Exception {
        fireball = new Fireball();
        sword = new Sword();
        dwarf= new Dwarf("Raymond",100, sword);
        wizard = new Wizard("Val", 100, fireball);
    }

    @Test
    public void getSpell() {
        assertEquals(fireball, wizard.getSpell());
    }

    @Test

    public void testCastingSpell() {
        wizard.casting(dwarf);
        assertEquals(50, dwarf.getHealthValue());
    }
}
