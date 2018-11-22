package Rooms;

import Players.IPlayer;

import java.util.ArrayList;
import java.util.Collections;

public class MonsterRoom implements IChallenge {


    public String interact(ArrayList<IPlayer> players) {
        Collections.shuffle(players);
        players.get(0).collectPoints(this);
        return "I'm a monster room!";
    }

}
