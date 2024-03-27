package patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyPlayerAction implements PlayerAction{
    private RealPlayerAction realPlayerAction;
    List<PlayerProxy> playerList = new ArrayList<PlayerProxy>();


    public ProxyPlayerAction(){
        this.realPlayerAction = new RealPlayerAction();
    }

    @Override
    public void action(PlayerProxy playerProxy) {

        if(playerList.contains(playerProxy)){
            System.out.println("Login " + playerProxy.name + " GG!");
        }
        else{

            for(var player:playerList){
                if(player.name.equals(playerProxy.name)) {
                    System.out.println("Player name used");
                    return;
                }
            }
            realPlayerAction.action(playerProxy);
            playerList.add(playerProxy);
        }
    }
}
