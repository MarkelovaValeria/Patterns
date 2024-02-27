package patterns.creational.abstract_factory;

import patterns.creational.factory.HeroFactory;

public class A_Factory {
    public Factory create(A_FactoryE type){
        switch (type) {
            case Hero -> {return new HeroFactory();}
            case Enemy -> {return new EnemyFactory();}
            default -> {throw new IllegalArgumentException("Unknown enemy type: " + type);}
        }
    }
}
