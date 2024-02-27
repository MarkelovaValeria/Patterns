package patterns.creational.factory;

public class Assassin extends CharacterClass {

    @Override
    public int hp() {
        return 140;
    }

    @Override
    public int damage() {
        return 250;
    }

    @Override
    public String information() {
        return "";
    }

    @Override
    public String toString() {
        return "Hp - " + hp() + "\nDamage - " + damage() + "\nInformation - " + information();
    }
}
