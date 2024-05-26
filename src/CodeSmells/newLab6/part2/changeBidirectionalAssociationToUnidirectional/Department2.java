package CodeSmells.newLab6.part2.changeBidirectionalAssociationToUnidirectional;

import java.util.List;

public class Department2 {
    private String name;
    private List<Employee8> employees;

    public Department2(String name, List<Employee8> employees){
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Employee8> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee8 employee8){
        employees.add(employee8);
    }
}
