package patterns.behavioral.command;

public class DomesticatedAnimal extends Animal{

    public WildAnimal wildAnimal;

    public DomesticatedAnimal(String name, int lvl, int hp, WildAnimal wildAnimal) {
        super(name, lvl, hp);
        this.wildAnimal = wildAnimal;
    }

    public void feed(){

        System.out.println("Fed " + getName());
    }

    public void attack(){
        System.out.println(getName() + " attacking");
    }

    public void defend(){
        System.out.println(getName() + " defending");
    }
}
