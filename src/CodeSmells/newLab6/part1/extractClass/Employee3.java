package CodeSmells.newLab6.part1.extractClass;

public class Employee3 {
    private String name;
    private String department;
    private double salary;

    // Конструктор
    public Employee3(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Геттери для полів
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

}
