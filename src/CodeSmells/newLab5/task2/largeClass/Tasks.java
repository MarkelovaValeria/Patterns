package CodeSmells.newLab5.task2.largeClass;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    private List<String> tasks;

    public Tasks() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void removeTask(String task) {
        this.tasks.remove(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
    public void displayInfo() {
        System.out.println("Tasks: " + this.tasks);
    }
}
