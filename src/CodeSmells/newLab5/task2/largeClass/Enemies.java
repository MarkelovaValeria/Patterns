package CodeSmells.newLab5.task2.largeClass;

import java.util.ArrayList;
import java.util.List;

public class Enemies {
    private List<String> enemies;

    public Enemies() {
        this.enemies = new ArrayList<>();
    }

    public void addEnemy(String enemy) {
        this.enemies.add(enemy);
    }

    public void removeEnemy(String enemy) {
        this.enemies.remove(enemy);
    }

    public List<String> getEnemies() {
        return enemies;
    }

    public void displayInfo() {
        System.out.println("Enemies: " + this.enemies);
    }
}
