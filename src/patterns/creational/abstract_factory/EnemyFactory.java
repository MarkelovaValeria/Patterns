package patterns.creational.abstract_factory;

import patterns.creational.factory.CharacterClass;
import patterns.creational.factory.CharacterE;

public class EnemyFactory extends Factory {
    public CharacterClass getCharacter(CharacterE type) {
        switch (type){
            case SpiderRom -> {return new Spider_Rom();}
            case Yharnam -> {return new Yharnam();}
            case VicarAmelia -> {return new Vicar_Amelia();}
            case MoonPresence -> {return new Moon_Presence();}
            default -> {throw new IllegalArgumentException("Unknown enemy type: " + type);}
        }
    }
}
