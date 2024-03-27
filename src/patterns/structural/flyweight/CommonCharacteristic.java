package patterns.structural.flyweight;

public class CommonCharacteristic {
    private int damage;
    private int level;

    public CommonCharacteristic(int damage, int level){
        this.damage = damage;
        this.level = level;
    }
    public int getDamage() {
        return damage;
    }


    public int getLevel() {
        return level;
    }

}
