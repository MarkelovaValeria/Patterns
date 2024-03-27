package patterns.structural.composite;

public class LeafEnemy implements ComponentMapInfo{
    private String name;
    private String type;
    int hp;
    int damage;

    public LeafEnemy(String name, String type, int hp, int damage){
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.damage = damage;
    }
    @Override
    public void display() {
        System.out.println("Enemy" + "\nName:" + name + "\nType: " + type + "\nHp: " + hp + "\nDamage: " + damage);
    }
}
