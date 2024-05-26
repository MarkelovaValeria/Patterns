package CodeSmells.newLab6.part1.hideDelegate;

public class Employee5 {
    private String name;
    private Department department;

    public Employee5(String name, Department department){
        this.name = name;
        this.department = department;
    }

    public Department getDepartment(){
        return department;
    }

    public String getName(){
        return name;
    }

    public String getManagerName(){
        if(department != null && department.getManager() !=null){
            return  department.getManager().getName();
        }
        return null;
    }
}
