package patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class PlayerGroup{
    private List<PlayerIt> playerItList;

    public PlayerGroup(){
        this.playerItList = new ArrayList<>();
    }

    public void addPlayer(PlayerIt playerIt){
        playerItList.add(playerIt);
    }

    public void  removePlayer(PlayerIt playerIt){
        playerItList.remove(playerIt);
    }
    public int getSize(){
        return playerItList.size();
    }

    public PlayerIt getPlayer(int index){
        return playerItList.get(index);
    }
    public Iterator createIterator(){
        return new Leader(this);
    }
}
