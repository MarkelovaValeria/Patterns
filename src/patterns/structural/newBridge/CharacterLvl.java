package patterns.structural.newBridge;

public class CharacterLvl {
    private String name;
    private LVL lvl;

    public CharacterLvl(String name, LVL lvl) {
        this.name = name;
        this.lvl = lvl;
    }

    public void lvlUp(){
        lvl.lvlUp();
    }
}
