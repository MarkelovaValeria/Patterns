package CodeSmells.newLab6.part1.moveField;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employeesList;
    private SalaryEmployee salaryEmployee;

    public Company(){
        employeesList = new ArrayList<>();
        salaryEmployee = new SalaryEmployee();
    }

    public void addEmployee(Employee employee, double salary){
        employeesList.add(employee);
        this.salaryEmployee.setSalary(employee, salary);
    }

    public void printEmployeeSalaries() {
        for (Employee employee : employeesList) {
            System.out.println(employee.getName() + ": " + salaryEmployee.getSalary(employee));
        }
    }
}
