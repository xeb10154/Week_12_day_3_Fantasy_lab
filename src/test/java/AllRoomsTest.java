import Players.Dwarf;
import Players.IPlayer;
import Players.Wizard;
import Rooms.IChallenge;
import Rooms.MonsterRoom;
import Rooms.TreasureRoom;
import Tools.Fireball;
import Tools.Sword;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AllRoomsTest {

    TreasureRoom treasureRoom;
    MonsterRoom monsterRoom;
    Dwarf dwarf;
    Wizard wizard;
    ArrayList<IPlayer> players = new ArrayList<IPlayer>();
    Sword sword = new Sword();
    Fireball fireball = new Fireball();



    @Before

    public void setup() {
        treasureRoom = new TreasureRoom();
        monsterRoom = new MonsterRoom();
        dwarf= new Dwarf("Raymond",100, sword);
        wizard = new Wizard("Val", 100, fireball);
        players.add(dwarf);
        players.add(wizard);
    }

    @Test

    public void testTypesOfRooms() {
        assertEquals("I'm a treasure room!", treasureRoom.interact(players));
        assertEquals("I'm a monster room!", monsterRoom.interact(players));
    }


}
