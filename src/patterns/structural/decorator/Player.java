package patterns.structural.decorator;

public class Player extends Character{
    public Player(int damage, int dexterity, int intelligence, int magical_Potential, String name) {
        super(damage, dexterity, intelligence, magical_Potential, name);
    }



    @Override
    public int showDamage() {
        return damage;
    }

    @Override
    public int showDexterity() {
        return dexterity;
    }

    @Override
    public int showIntelligence() {
        return intelligence;
    }

    @Override
    public int showMagic() {
        return magical_Potential;
    }
}
