package patterns.behavioral.memento;

import patterns.behavioral.chainOfResponsibility.Inventory;
import patterns.behavioral.mediator.Mediator;

public class Memento {
    private  String name;
    private int lvl;
    private int hp;
    private int damage;
    private Inventory inventory;
    private String location;

    public Memento(String name, int lvl, int hp, int damage, String location, Inventory inventory){
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
        this.damage = damage;
        this.location = location;
        this.inventory = inventory;
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

    public int getDamage() {
        return damage;
    }

    public Inventory getInventory() {
        return inventory;
    }


    public String getLocation() {
        return location;
    }
}
