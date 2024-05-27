package CodeSmells.newLab6.part5.extractSuperclass;


public class Manager7 extends Personn {
    private String department;
    public Manager7(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
