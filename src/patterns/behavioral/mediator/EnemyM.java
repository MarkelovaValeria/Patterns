package patterns.behavioral.mediator;

import patterns.behavioral.chainOfResponsibility.Inventory;

public class EnemyM {
    private String name;
    private int hp;
    private int lvl;
    private int damage;
    private Inventory inventory;

    public EnemyM(String name, int hp, int damage, int lvl){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.lvl = lvl;
        this.inventory = new Inventory();
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }


    public Inventory getInventory() {
        return inventory;
    }

    public int getLvl() {
        return lvl;
    }

    public int getDamage() {
        return damage;
    }

    public void damagePlayer(PlayerM playerM){
        if(playerM.getLvl() > lvl){
            hp -= playerM.getDamage();
            System.out.println("-hp enemy");
            if(hp<=0){
                System.out.println("The enemy is killed");
                playerM.getInventory().addItem("coins", 10450);
                playerM.getInventory().addItem("necklace", 1);
            }
        }else{
            playerM.setHp(playerM.getHp()-damage);
            System.out.println("-hp player");
        }
    }
}
