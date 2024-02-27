package patterns.creational.abstract_factory;

import patterns.creational.factory.CharacterClass;

public class Vicar_Amelia extends CharacterClass {
    @Override
    public int hp() {
        return 	5367;
    }

    @Override
    public int damage() {
        return 250;
    }

    @Override
    public String information() {
        return "In stark contrast with the Beast Patients, people that slowly turn into monsters under layers of bandages, this woman shows perfectly what happens when a human mutates suddenly into a full-fledged Beast: at first Amelia is seen as a normal human woman with tattered white robes, kneeling and reciting a prayer, but after a few instants she changes abruptly.";
    }

    @Override
    public String toString() {
        return "Hp - " + hp() + "\nDamage - " + damage() + "\nInformation - " + information();
    }
}
