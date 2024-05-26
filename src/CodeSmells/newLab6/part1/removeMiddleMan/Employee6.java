package CodeSmells.newLab6.part1.removeMiddleMan;

public class Employee6 {
    private String name;
    private Department6 department;

    public Employee6(String name, Department6 department){
        this.name = name;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public Department6 getDepartment(){
        return department;
    }
}
