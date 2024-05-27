package CodeSmells.newLab6.part5.pullUpConstructorBody;

public class Dog3 extends Animal3{
    String breed;
    public Dog3(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
