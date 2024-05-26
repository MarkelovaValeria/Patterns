package CodeSmells.newLab6.part1.removeMiddleMan;

public class Department6 {
    private String name;
    private Employee6 manager;

    public Department6(String name, Employee6 manager){
        this.name = name;
        this.manager = manager;
    }

    public String getManagerName(){
        return manager.getName();
    }
}
