package patterns.structural.proxy;

public class RealPlayerAction implements  PlayerAction{
    @Override
    public void action(PlayerProxy playerProxy) {
        System.out.println("Register... "+playerProxy.name +" add!");
        }
}
