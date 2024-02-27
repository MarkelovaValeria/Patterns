package patterns.creational.abstract_factory;

import patterns.creational.factory.CharacterClass;

public class Spider_Rom extends CharacterClass {
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
        return "Rom, the Vacuous Spider controls the barrier that prevents normal humans from seeing the true horrors around them, such as the Lesser Amygdalae crawling around Cathedral Ward. Rom was once a scholar of Byrgenwerth who at some point went through metamorphosis into a Kin courtesy of Kos, according to dialogue given by Micolash.Z";
    }

    @Override
    public String toString() {
        return "Hp - " + hp() + "\nDamage - " + damage() + "\nInformation - " + information();
    }
}
