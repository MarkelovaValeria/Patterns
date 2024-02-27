package patterns.creational.prototype;

public class EnemyNpc extends Npc {

//add fildes, constructor;

    private String name;
    private int hp;

    public EnemyNpc(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String Name() {
        return name;
    }

    @Override
    public int Hp() {
        return hp;
    }

    @Override
    public EnemyPrototype doClone() {
        return this;
    }

    @Override
    public String toString() {
        return "Name - " + Name() + "\nHp - " + Hp();
    }


}
