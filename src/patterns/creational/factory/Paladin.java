package patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class Paladin extends CharacterClass {
    private List<String> phrase = new ArrayList<>();
    public Paladin(){
        this.phrase.add("pphrase1");
        this.phrase.add("pphrase2");
        this.phrase.add("pphrase3");
    }

    @Override
    public int hp() {
        return 420;
    }

    @Override
    public int damage() {
        return 200;
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
