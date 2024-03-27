package patterns.creational.abstract_factory;

import patterns.creational.factory.CharacterClass;
import patterns.creational.factory.CharacterE;


public abstract class Factory {
    public abstract CharacterClass getCharacter(CharacterE type);
}