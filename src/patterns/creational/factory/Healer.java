package patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class Healer extends CharacterClass {
    private List<String> phrase = new ArrayList<>();

    public Healer(){
        this.phrase.add("hphrase1");
        this.phrase.add("hphrase2");
        this.phrase.add("hphrase3");
    }

    @Override
    public int hp() {
        return 250;
    }

    @Override
    public int damage() {
        return 100;
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
