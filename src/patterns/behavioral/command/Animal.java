package patterns.behavioral.command;

public class Animal {
    private String name;
    private int lvl;
    private int hp;

    public Animal(String name, int lvl, int hp){
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public int getHp() {
        return hp;
    }
}
