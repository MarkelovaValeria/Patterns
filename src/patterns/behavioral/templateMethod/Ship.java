package patterns.behavioral.templateMethod;

public class Ship {
    private int hp;
    private int defend;

    public Ship( int hp, int defend){
        this.hp = hp;
        this.defend = defend;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
