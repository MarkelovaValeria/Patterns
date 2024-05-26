package CodeSmells.newLab6.part2.selfEncapsulateField;

public class EmployeeS {
    private String name;
    private double salary;

    public EmployeeS(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public void raiseSalary(double amount){
        if(amount>0){
            setSalary(getSalary()+amount);
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
