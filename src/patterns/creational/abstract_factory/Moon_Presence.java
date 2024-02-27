package patterns.creational.abstract_factory;

import patterns.creational.factory.CharacterClass;

public class Moon_Presence extends CharacterClass {
    @Override
    public int hp() {
        return 8909;
    }

    @Override
    public int damage() {
        return 28000;
    }

    @Override
    public String information() {
        return "Yharnam was the Queen of the ancient Pthumerian civilization and mother to the child Mergo. She wears a white, bloodstained dress with a veil to conceal her face, although she removes it when the player finds her in the Nightmare of Mensis. Like other Pthumerians, she has black eyes with no pupils and skin resembling a shriveled corpse.";
    }
    @Override
    public String toString() {
        return "Hp - " + hp() + "\nDamage - " + damage() + "\nInformation - " + information();
    }
}
