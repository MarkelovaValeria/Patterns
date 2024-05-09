package patterns.behavioral.chainOfResponsibility;

public class PlayerC {
    private String name;
    private int lvl;
    private int damage;
    private int reputation;
    private int coins;
    private Inventory inventory;

    public PlayerC(String name, int lvl, int damage, int reputation, int coins){
        this.name = name;
        this.lvl=lvl;
        this.damage = damage;
        this.reputation = reputation;
        this.coins = coins;
        this.inventory = new Inventory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Player: \nName - " + name + "\nLvl - " + lvl + "\nDamage - " + damage + "\nInventory - " + inventory + "Reputation - " + reputation;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }


}
