package patterns.creational.factory;
import patterns.creational.abstract_factory.Factory;
public class HeroFactory extends Factory {
    //enum hero type;
    public CharacterClass getCharacter(CharacterE type) {
        switch (type){
            case Assassin -> {return new Assassin();}
            case Paladin -> {return new Paladin();}
            case Healer -> {return new Healer();}
            case Mage -> {return new Mage();}
            default -> {throw new IllegalArgumentException("Unknown enemy type: " + type);}
        }
    }
}
