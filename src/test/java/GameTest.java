import Players.Dwarf;
import Players.Fighter;
import Players.IPlayer;
import Players.Wizard;
import Rooms.MonsterRoom;
import Rooms.TreasureRoom;
import Tools.Fireball;
import Tools.Sword;
import Game.Game;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {

    Game game;
    Dwarf dwarf;

    @Before
    public void setUp() throws Exception {
        Sword sword = new Sword();
        dwarf = new Dwarf("Raymond",100, sword);
        game = new Game();
        game.setUp();
    }

    @Test
    public void canSetUpGame() {
        game.setUp();
    }

    @Test
    public void playGame() {
        assertTrue(game.playGame() instanceof IPlayer);
    }
}
