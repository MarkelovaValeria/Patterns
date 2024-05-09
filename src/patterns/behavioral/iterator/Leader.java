package patterns.behavioral.iterator;

public class Leader implements Iterator{
    private PlayerGroup playerGroup;
    private int index;

    public Leader(PlayerGroup playerGroup){
        this.index = 0;
        this.playerGroup = playerGroup;
    }
    @Override
    public boolean hasNext() {
        return this.index<playerGroup.getSize();
    }

    @Override
    public PlayerIt next() {
        if(!hasNext()){
            System.out.println("The end....x_x");
            return null;
        }
        else{
            PlayerIt item = playerGroup.getPlayer(index);
            index++;
            return item;
        }
    }

    @Override
    public void reset() {
        this.index = 0;
    }
}
