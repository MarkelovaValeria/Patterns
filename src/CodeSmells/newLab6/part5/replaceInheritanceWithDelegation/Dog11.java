package CodeSmells.newLab6.part5.replaceInheritanceWithDelegation;

public class Dog11 {
    private final Animal11 animal11;

    public Dog11(Animal11 animal11) {
        this.animal11 = animal11;
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    public void eat(){
        animal11.eat();
    }

    public void sleep(){
        animal11.sleep();
    }
}
