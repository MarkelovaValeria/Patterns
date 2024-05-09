package patterns.behavioral.command;

import patterns.behavioral.chainOfResponsibility.Inventory;

import java.util.ArrayList;
import java.util.List;

public class ElfCom {
    private String name;
    private int lvl;
    private int hp;
    private Inventory inventory;


    private int damage;
    private List<DomesticatedAnimal> animalList;

    public ElfCom(String name, int lvl, int hp, int damage){
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
        this.damage = damage;
        this.animalList = new ArrayList<>();
        this.inventory = new Inventory();
    }

    public void allCommand(Command command){
        command.execute();
    }


    public List<DomesticatedAnimal> getAnimalList() {
        return animalList;
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
    };

    public void setHp(int hp) {
        this.hp = hp;
    }
}
