package CodeSmells.newLab6.part5.collapseHierarchy;

public class Animal9 {
    private String species;

    public Animal9(String species){
        this.species = species;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }

}
