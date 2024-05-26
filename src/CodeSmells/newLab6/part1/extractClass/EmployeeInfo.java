package CodeSmells.newLab6.part1.extractClass;

public class EmployeeInfo {
    private Employee3 employee3;

    public EmployeeInfo(Employee3 employee3){
        this.employee3 = employee3;
    }

    public void printEmployeeDetails(){
        System.out.println("Name: "+ employee3.getName()+ "\nDepartment: "+employee3.getDepartment()+"\nSalary: "+employee3.getSalary());
    }
}
