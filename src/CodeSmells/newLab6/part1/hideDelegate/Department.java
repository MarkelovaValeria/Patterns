package CodeSmells.newLab6.part1.hideDelegate;

public class Department {
    private String name;
    private Employee5 manager;

    public Department(String name, Employee5 manager){
        this.name = name;
        this.manager = manager;
    }

    public String getName(){
        return name;
    }

    public Employee5 getManager(){
        return manager;
    }

}
