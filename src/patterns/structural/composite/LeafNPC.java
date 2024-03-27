package patterns.structural.composite;

public class LeafNPC implements ComponentMapInfo{
    private String name;
    private int hp;
    private int damage;

    public LeafNPC(String name, int hp, int damage){
        this.name = name;
        this.hp= hp;
        this.damage = damage;
    }
    @Override
    public void display() {
        System.out.println("NPC" + "\nName:"+ name + "\nHp: " + hp + "\nDamage: " + damage);
    }
}
