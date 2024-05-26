package CodeSmells.newLab6.part1.moveField;

import java.util.HashMap;
import java.util.Map;

public class SalaryEmployee {
    private Map<Employee, Double> salaries;

    public SalaryEmployee(){
        salaries = new HashMap<>();
    }
    public void setSalary(Employee employee, double salary) {
        salaries.put(employee, salary);
    }

    public double getSalary(Employee employee) {
        return salaries.getOrDefault(employee, 0.0);
    }


}
