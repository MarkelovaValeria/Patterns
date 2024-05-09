package patterns.behavioral.templateMethod;

public class BattleShip extends Ship{
    private int damage;

    public BattleShip(int hp, int defend, int damage) {
        super(hp, defend);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
