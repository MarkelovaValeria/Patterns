package patterns.behavioral.iterator;

import patterns.behavioral.chainOfResponsibility.Inventory;

public class PlayerIt {
    private String name;
    private int lvl;
    private int hp;
    private int damage;
    private Inventory inventory;

    public PlayerIt(String name, int lvl, int hp, int damage){
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
        this.damage = damage;
        this.inventory = new Inventory();
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

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
