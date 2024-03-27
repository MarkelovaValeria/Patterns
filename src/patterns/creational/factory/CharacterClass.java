package patterns.creational.factory;

import patterns.structural.bridge.Phrase;

public abstract class CharacterClass {
    Phrase bridge;
    public abstract int hp();
    public abstract int damage();
    public abstract void sayPhrase();
    public abstract String information();

    public void setBridge(Phrase bridge) {
        this.bridge = bridge;
    }
}
