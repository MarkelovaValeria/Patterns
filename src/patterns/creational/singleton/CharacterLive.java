package patterns.creational.singleton;

public class CharacterLive {
    private static CharacterLive instance;
    private int lives = 3;

    public static CharacterLive getInstance() {
        if (instance == null) {
            instance = new CharacterLive();
        }
        return instance;
    }

    public String getLives() {
        return "your lives - " + lives;
    }

    public void loseLife() {
        lives--;
        if(lives <= 0){
            System.out.println("Game Over!");
        }
        else{
            System.out.println("You lost a life! Remaining lives: " + lives);
        }
    }
}
