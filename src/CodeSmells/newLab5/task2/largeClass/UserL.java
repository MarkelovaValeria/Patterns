package CodeSmells.newLab5.task2.largeClass;

public class UserL {
    private String name;
    private int age;
    private String gender;

    public UserL(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }
}
