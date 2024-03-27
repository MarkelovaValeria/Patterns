package patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class Mage extends CharacterClass {
    private List<String> phrase = new ArrayList<>();
    public Mage(){
        this.phrase.add("mphrase1");
        this.phrase.add("mphrase2");
        this.phrase.add("mphrase3");
    }
    @Override
    public int hp() {
        return 240;
    }

    @Override
    public int damage() {
        return 270;
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
