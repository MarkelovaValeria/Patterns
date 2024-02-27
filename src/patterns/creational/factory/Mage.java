package patterns.creational.factory;

public class Mage extends CharacterClass {
    @Override
    public int hp() {
        return 240;
    }

    @Override
    public int damage() {
        return 270;
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
