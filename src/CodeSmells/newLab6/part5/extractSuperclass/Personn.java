package CodeSmells.newLab6.part5.extractSuperclass;

public class Personn {
    protected String name;
    protected double salary;

    public Personn(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name );
        System.out.println("Salary: " + salary);
    }
}
