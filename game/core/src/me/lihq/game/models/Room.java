package me.lihq.game.models;

/**
 * Created by vishal on 20/11/2016.
 */

import me.lihq.game.Settings;

import java.util.ArrayList;
import java.util.List;

public class Room
{
    private String roomName= "";
    private int ID = -1;

    private List<Clue> cluesInRoom = new ArrayList<Clue>();

    private String mapFile = "map.tmx";

    private boolean murderRoom = false;

    public Room(int id, String mapFile, String roomName)
    {
        this.ID = id;
        this.mapFile = mapFile;
        this.roomName = roomName;
    }

    //Returns True if it's the room the murder took place in
    public boolean isMurderRoom() {return murderRoom;}

    public int getID(){return this.ID;}

    /**Changes coordinates of clue*/
    public void moveClue(Clue clue, int x, int y)
    {
        if (cluesInRoom.contains(clue))
        {
            clue.setCoords(x, y);
        }
    }

    public void addClue(Clue newClue)
    {
        if (!cluesInRoom.contains(newClue))
        {
            cluesInRoom.add(newClue);
        }
    }

    public void removeClue(Clue toRemove)
    {
        if (cluesInRoom.contains(toRemove))
        {
            cluesInRoom.remove(toRemove);
        }
    }
}


