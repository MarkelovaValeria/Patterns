package CodeSmells.newLab6.part2.replaceTypeCodeWithSubclasses;

public abstract class Product5 {
    private String name;

    public Product5(String name){
        this.name = name;
    }

    public abstract void process();

    public String getName() {
        return name;
    }
}
