package CodeSmells.newLab6.part5.replaceInheritanceWithDelegation;

public class Person11 {
    private final Dog11 dog11;

    public Person11(Dog11 dog11) {
        this.dog11 = dog11;
    }

    public void interactWithDog(){
        dog11.eat();
        dog11.sleep();
    }
}
