package CodeSmells.newLab6.part2.replaceDataValueWithObject;

public class Customer {
    private String name;

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
