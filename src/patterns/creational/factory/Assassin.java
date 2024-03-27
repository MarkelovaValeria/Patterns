package patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class Assassin extends CharacterClass {

    private List<String> phrase = new ArrayList<>();
    public Assassin(){
        this.phrase.add("aphrase1");
        this.phrase.add("aphrase2");
        this.phrase.add("aphrase3");
    }

    @Override
    public int hp() {
        return 140;
    }

    @Override
    public int damage() {
        return 250;
    }

    @Override
    public void sayPhrase() {
        this.bridge.speak(phrase.get((int)Math.floor(Math.random()*phrase.size())));
    }

    @Override
    public String information() {
        return null;
    }

    @Override
    public String toString() {
        return "Hp - " + hp() + "\nDamage - " + damage();
    }
}
