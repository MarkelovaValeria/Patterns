package patterns.creational.factory;

public class Healer extends CharacterClass {

    @Override
    public int hp() {
        return 250;
    }

    @Override
    public int damage() {
        return 100;
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
