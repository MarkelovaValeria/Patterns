package patterns.creational.abstract_factory;

import patterns.creational.factory.CharacterClass;


public abstract class Factory {
    public abstract CharacterClass getCharacter(String type);
}