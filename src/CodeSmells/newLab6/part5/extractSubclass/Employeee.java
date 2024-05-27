package CodeSmells.newLab6.part5.extractSubclass;

public class Employeee {
     String name;
     double salary;


    public Employeee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void giveRaise(double amount){
        this.salary +=amount;
    }

    public double getSalary() {
        return salary;
    }
}
