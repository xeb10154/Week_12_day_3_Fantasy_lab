package Game;

import Players.Dwarf;
import Players.IPlayer;
import Players.Wizard;
import Rooms.IChallenge;
import Rooms.MonsterRoom;
import Rooms.TreasureRoom;
import Tools.Fireball;
import Tools.Sword;

import java.util.ArrayList;

public class Game {

    private ArrayList<IChallenge> rooms = new ArrayList<IChallenge>();
    private MonsterRoom monsterRoom = new MonsterRoom();
    private TreasureRoom treasureRoom = new TreasureRoom();
    private ArrayList<IPlayer> players = new ArrayList<IPlayer>();
    private Dwarf dwarf;
    private Wizard wizard;
    private Sword sword = new Sword();
    private Fireball fireball = new Fireball();

    public Game() {
        this.rooms = rooms;
        this.players = players;
    }

    public void setUp(){
        rooms.add(monsterRoom);
        rooms.add(treasureRoom);
        dwarf= new Dwarf("Raymond",100, sword);
        wizard = new Wizard("Val", 100, fireball);
        players.add(dwarf);
        players.add(wizard);
    }

    public IPlayer playGame(){
        for (IChallenge room: rooms){
            room.interact(players);
        }
        IPlayer winner = players.get(0);
        return winner;
    }



}
