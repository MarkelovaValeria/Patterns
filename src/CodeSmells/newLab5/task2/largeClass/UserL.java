package CodeSmells.newLab5.task2.largeClass;

public class UserL {
    private String name;
    private int age;
    private String gender;
    private Friends friends;
    private Enemies enemies;
    private Tasks tasks;

    public UserL(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.friends = new Friends();
        this.enemies = new Enemies();
        this.tasks = new Tasks();
    }
    public Friends getFriends() {
        return friends;
    }

    public Enemies getEnemies() {
        return enemies;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }
}
