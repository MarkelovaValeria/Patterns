package patterns.creational.abstract_factory;

import patterns.creational.factory.CharacterClass;

public class EnemyFactory extends Factory {
    public CharacterClass getCharacter(String type) {
        switch (type){
            case "Spider Rom" -> {return new Spider_Rom();}
            case "Yharnam" -> {return new Yharnam();}
            case "Vicar Amelia" -> {return new Vicar_Amelia();}
            case "Moon Presence" -> {return new Moon_Presence();}
            default -> {throw new IllegalArgumentException("Unknown enemy type: " + type);}
        }
    }
}
