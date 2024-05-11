package CodeSmells.newLab5.task2.largeClass;

public class NewLargeClass {
    private UserL userL;
    private Friends friends;
    private Enemies enemies;
    private Tasks tasks;

    public NewLargeClass(UserL userL) {
        this.userL = userL;
        this.friends = new Friends();
        this.enemies = new Enemies();
        this.tasks = new Tasks();
    }

    public UserL getUserL() {
        return userL;
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
}