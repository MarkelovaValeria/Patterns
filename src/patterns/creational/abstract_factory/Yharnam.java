package patterns.creational.abstract_factory;

import patterns.creational.factory.CharacterClass;

public class Yharnam extends CharacterClass {
    @Override
    public int hp() {
        return 3645;
    }

    @Override
    public int damage() {
        return 250;
    }

    @Override
    public void sayPhrase() {

    }

    @Override
    public String information() {
        return "The Shadow of Yharnam consists of three figures shrouded in black robes. As the fight progresses they are revealed to have been infected with the parasitic snakes that infest the woods and undergo gruesome mutations. They share a symbiotic link with the vipers, either transforming their arms to use them as whips or summoning gigantic serpents to devour victims.";
    }

    @Override
    public String toString() {
        return "Hp - " + hp() + "\nDamage - " + damage() + "\nInformation - " + information();
    }
}
