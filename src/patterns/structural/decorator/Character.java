package patterns.structural.decorator;

public abstract class Character {
    int damage;
    int dexterity;
    int intelligence;
    int magical_Potential;
    String name;

    public Character(int damage, int dexterity, int intelligence, int magical_Potential, String name) {
        this.damage = damage;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.magical_Potential = magical_Potential;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\ndamage - " + showDamage() + "\ndexterity - " + showDexterity() + "\nintelligence - " + showIntelligence() + "\nmagical potential - " + showMagic();
    }

    public abstract int showDamage();

    public abstract int showDexterity();
    public abstract int showIntelligence();
    public abstract int showMagic();



}
