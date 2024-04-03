package patterns.structural.newBridge;

public class HealerLvl implements LVL{
    @Override
    public void lvlUp() {
        System.out.println("Healer completed quest 'Name2' for lvl up!");
    }
}
