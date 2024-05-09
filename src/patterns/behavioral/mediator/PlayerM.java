package patterns.behavioral.mediator;

import patterns.behavioral.chainOfResponsibility.Inventory;
import patterns.behavioral.memento.Memento;

public class PlayerM {
    private String name;
    private int lvl;
    private int hp;
    private int damage;
    private Inventory inventory;
    private Mediator mediator;
    private String location;

    public PlayerM(String name, int lvl, int hp, int damage, String location){
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
        this.damage = damage;
        this.location = location;
        this.inventory = new Inventory();
    }
    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }
    public void setLvl(int lvl) {
        this.lvl = lvl;
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

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void attack(EnemyM enemyM){
        mediator.attack();
    }

    public void collectingItem(Items item){
        mediator.collecting(item);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Memento save(){
        return new Memento(this.name, this.lvl, this.hp, this.damage, this.location, this.inventory);
    }
    public void restore(Memento memento){
        this.name = memento.getName();
        this.lvl = memento.getLvl();
        this.hp = memento.getHp();
        this.location = memento.getLocation();
        this.damage = memento.getDamage();
        this.inventory = memento.getInventory();
    }
}
