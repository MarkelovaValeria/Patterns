package patterns.creational.factory;

public class Paladin extends CharacterClass {

    @Override
    public int hp() {
        return 420;
    }

    @Override
    public int damage() {
        return 200;
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
